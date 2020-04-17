package com.example.helloapp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloapp.service.AddService;

@Component
public class UserA {
	
	@Autowired 
	AddService addService;
	
	public void showCalculations(Integer a,Integer b) {
		Integer addTwoNumbers = addService.addTwoNumbers(a, b);
		System.out.println("Two number sum is "+addTwoNumbers);
		System.out.println("Have a great day!");
	}

	public AddService getAddService() {
		return addService;
	}

	public void setAddService(AddService addService) {
		this.addService = addService;
	}
	
	
}
