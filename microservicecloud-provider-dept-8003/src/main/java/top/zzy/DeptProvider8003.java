package top.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class DeptProvider8003 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003.class, args);
	}
}
