package com.example.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.helloservice.ConsoleHelloService;
import com.example.helloservice.HelloService;

@SpringBootApplication
public class HelloAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
	}
	
	@Bean
	HelloService getHelloServiceBean() {
		return new ConsoleHelloService("Howdy","!");
	}
}	

