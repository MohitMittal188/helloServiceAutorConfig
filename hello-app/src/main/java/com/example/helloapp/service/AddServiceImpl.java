package com.example.helloapp.service;

import org.springframework.stereotype.Component;

@Component
public class AddServiceImpl implements AddService {

	@Override
	public Integer addTwoNumbers(Integer a, Integer b) {
		return a+b;
	}

}
