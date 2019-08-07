package top.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableHystrix
public class DeptProvider8001Hystrix {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001Hystrix.class, args);
	}
}
