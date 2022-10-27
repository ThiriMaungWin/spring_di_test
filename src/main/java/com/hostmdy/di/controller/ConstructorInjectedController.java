package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	public GreetingService greetingService;
	
	
	@Autowired //dependency injection
	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImp") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayHello();
	}

	
	
}
