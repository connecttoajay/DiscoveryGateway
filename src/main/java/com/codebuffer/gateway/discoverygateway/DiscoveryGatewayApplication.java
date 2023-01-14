package com.codebuffer.gateway.discoverygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryGatewayApplication.class, args);
	}

}
