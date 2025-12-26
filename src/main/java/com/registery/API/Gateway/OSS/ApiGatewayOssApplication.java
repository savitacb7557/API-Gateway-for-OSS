package com.registery.API.Gateway.OSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayOssApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayOssApplication.class, args);
	}

}
