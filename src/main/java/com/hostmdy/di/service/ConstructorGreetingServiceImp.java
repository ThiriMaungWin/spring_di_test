package com.hostmdy.di.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImp implements GreetingService{
public static final String HELLO_WORLD = "Hello from Constructor greeting service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}
}
