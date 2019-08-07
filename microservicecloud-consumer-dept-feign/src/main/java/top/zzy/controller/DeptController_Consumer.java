package top.zzy.controller;

import org.springframework.web.bind.annotation.*;
import top.zzy.entity.Dept;
import top.zzy.service.DeptClientService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zzy
 * @description 消费者
 * @date 2019/7/27
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    @Resource
    private DeptClientService deptClientService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {

        return deptClientService.add(dept);
    }

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable Integer id) {

        return deptClientService.get(id);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Dept> lsit() {
        return deptClientService.list();
    }

}
