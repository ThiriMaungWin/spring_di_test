package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImp;

class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController = 
			new SetterInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImp greetingService = new GreetingServiceImp();
		setterInjectedController.setGreetingService(greetingService);
	}
	

	@Test
	void test() {
		assertEquals(GreetingServiceImp.HELLO_WORLD, setterInjectedController.sayHello());
	}

}
