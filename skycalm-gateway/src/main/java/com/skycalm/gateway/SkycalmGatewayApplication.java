package com.skycalm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkycalmGatewayApplication {

	public static void main(String[] args) {
		System.out.println(">>> SkyCalm Gateway is starting...");
		SpringApplication.run(SkycalmGatewayApplication.class, args);
	}

}
