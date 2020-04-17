package com.example.helloapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.helloapp.service.user.UserA;
import com.example.helloservice.HelloService;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	HelloService helloService;
	UserA userA;
	
	MyCommandLineRunner(HelloService helloService,UserA userA){
		this.helloService = helloService;
		this.userA = userA;
	}
	
	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello("mohit");
		userA.showCalculations(2,5);
	}

}
