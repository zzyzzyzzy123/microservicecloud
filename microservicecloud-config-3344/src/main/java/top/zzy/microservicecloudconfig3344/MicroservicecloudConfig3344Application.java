package top.zzy.microservicecloudconfig3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicecloudConfig3344Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConfig3344Application.class, args);
	}

}
