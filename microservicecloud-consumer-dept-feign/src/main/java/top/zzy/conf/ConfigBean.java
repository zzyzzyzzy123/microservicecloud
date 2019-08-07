package top.zzy.conf;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzy
 * @description 配置类
 * @date 2019/7/27
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //springcloud是基于Netflix ribbon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //ribbon负载均衡算法
    @Bean
    public IRule myRule(){
        //RetryRule 默认轮询，有服务挂了击此访问不到则不在访问

        return new RandomRule();//随机算法取代轮询
    }
}
