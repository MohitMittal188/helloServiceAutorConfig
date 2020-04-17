package com.example.helloapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.helloservice.HelloService;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	HelloService helloService;
	
	MyCommandLineRunner(HelloService helloService){
		this.helloService = helloService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello("mohit");

	}

}
