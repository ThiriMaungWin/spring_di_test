package com.hostmdy.di.service;

import org.springframework.stereotype.Service;

@Service
//Or
//@Component
public class GreetingServiceImp implements GreetingService {
	public static final String HELLO_WORLD = "Hello from Original greeting service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}

}
