package top.zzy.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import top.zzy.entity.Dept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzy
 * @description fallback实现类,要加@Component
 * @date 2019/8/2
 */
@Component
public class DeptServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Integer id) {
                Dept dept = new Dept();
                dept.setId(id).setDb_source("没有找到对应数据库").setDname("没有找到对应d_name");
                return dept;
            }

            @Override
            public List<Dept> list() {
                List<Dept> list = new ArrayList<>();
                Dept dept = new Dept();
                dept.setId(0).setDb_source("没有找到对应数据库").setDname("没有找到对应d_name");
                list.add(dept);
                return list;
            }
        };
    }
}
