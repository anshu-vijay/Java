package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/*Feign clients are a declarative HTTP client in Spring Boot
 that simplifies the process of calling REST APIs
 between microservices. Instead of manually constructing
 HTTP requests using tools like RestTemplate,
 eign provides an interface-driven approach to making remote calls,
 significantly reducing boilerplate code and improving readability.*/
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
