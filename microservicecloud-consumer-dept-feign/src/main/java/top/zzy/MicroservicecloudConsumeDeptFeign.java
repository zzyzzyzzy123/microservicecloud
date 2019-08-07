package top.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import top.robbin.rule.MySelfRule;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "top.zzy.service")
@ComponentScan("top.zzy")
public class MicroservicecloudConsumeDeptFeign
{
    public static void main( String[] args )
    {
        SpringApplication.run(MicroservicecloudConsumeDeptFeign.class,args);
        System.out.println( "Hello World!" );
    }
}
