package top.zzy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import top.zzy.entity.Dept;
import top.zzy.service.DeptService;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
	@Autowired
	DeptService deptServiceImpl;
	@Autowired
    private DiscoveryClient discoveryClient;

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {

		return deptServiceImpl.add(dept);
	}
    @HystrixCommand(fallbackMethod = "getDefault")
	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable Integer id) {

        Dept dept = deptServiceImpl.get(id);
        if(dept==null){
            throw new RuntimeException("没有找到对应的dept");
        }
        return dept;
    }

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Dept> lsit() {
		return deptServiceImpl.list();
	}

	@RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discover(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("microservicecloud-dept");
        for (ServiceInstance instance:instances) {
            System.out.println(instance.getHost()+":"+instance.getPort()+"\n"+instance.getUri());
        }
        return discoveryClient;
    }

    //hystrix处理回调函数

    public Dept getDefault(@PathVariable Integer id) {
        Dept dept = new Dept();
        dept.setId(id).setDb_source("没有找到对应数据库").setDname("没有找到对应d_name");
        return dept;
    }
}
