package edu.ka.springcloud.springvloudlab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudLab4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudLab4EurekaServerApplication.class, args);
	}
}
