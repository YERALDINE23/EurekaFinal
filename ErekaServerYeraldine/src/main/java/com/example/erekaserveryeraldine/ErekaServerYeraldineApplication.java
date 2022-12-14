package com.example.erekaserveryeraldine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErekaServerYeraldineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErekaServerYeraldineApplication.class, args);
	}

}
