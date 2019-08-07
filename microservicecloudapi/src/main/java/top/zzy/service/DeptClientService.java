package top.zzy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.zzy.entity.Dept;

import java.util.List;

@FeignClient(value = "microservicecloud-dept",fallbackFactory = DeptServiceFallBackFactory.class)
@RequestMapping("dept")
@Service("deptClientService")
public interface DeptClientService {

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id);

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Dept> list();

}
