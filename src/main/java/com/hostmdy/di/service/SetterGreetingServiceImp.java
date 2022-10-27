package com.hostmdy.di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImp implements GreetingService{
public static final String HELLO_WORLD = "Hello from Setter greeting service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}
}
