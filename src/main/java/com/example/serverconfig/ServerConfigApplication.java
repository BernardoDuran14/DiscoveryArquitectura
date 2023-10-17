package com.example.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer // This annotation is required to make this application a config server.
public class ServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class, args);
	}

}
