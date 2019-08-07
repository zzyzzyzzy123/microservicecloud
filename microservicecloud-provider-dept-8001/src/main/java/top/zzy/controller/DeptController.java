package top.zzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import top.zzy.service.DeptService;
import top.zzy.entity.Dept;

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

	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable Integer id) {

		return deptServiceImpl.get(id);
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
}
