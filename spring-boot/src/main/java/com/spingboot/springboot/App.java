package com.spingboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class App {
	@RequestMapping(value = "/helloSpringBoot")
	public String available() {
		return "hello spring boot";
	}


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
