package top.robbin.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzy
 * @description ribbon负载规则
 * @date 2019/8/1
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){

        return new BillonRule_zzy();//随机算法取代轮询
    }
}
