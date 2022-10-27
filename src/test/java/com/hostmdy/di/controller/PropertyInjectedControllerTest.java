package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImp;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController = 
			new PropertyInjectedController();
	
	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImp greetingService = new GreetingServiceImp();
		propertyInjectedController.greetingService = greetingService;
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImp.HELLO_WORLD, propertyInjectedController.sayHello());
	}

}
