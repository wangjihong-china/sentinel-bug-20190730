package com.javalsj.datacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class JavalsjDatacenterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavalsjDatacenterAppApplication.class, args);
	}

}
