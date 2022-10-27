package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class SetterInjectedController {
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	@Autowired //dependency injection
	@Qualifier("setterGreetingServiceImp")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}
