package edu.ka.springcloud.springcloudlab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudLab3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudLab3Application.class, args);
	}
}
