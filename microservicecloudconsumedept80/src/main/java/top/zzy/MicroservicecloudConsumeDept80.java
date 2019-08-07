package top.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import top.robbin.rule.MySelfRule;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@RibbonClient(name = "microservicecloud-dept",configuration = MySelfRule.class)
public class MicroservicecloudConsumeDept80
{
    public static void main( String[] args )
    {
        SpringApplication.run(MicroservicecloudConsumeDept80.class,args);
        System.out.println( "Hello World!" );
    }
}
