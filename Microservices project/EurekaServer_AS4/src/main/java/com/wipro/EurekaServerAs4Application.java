package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAs4Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAs4Application.class, args);
	}
	
	

}

