package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImp;

class ConstructorInjectedControllerTest {
	ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImp greetingService = new GreetingServiceImp();
		constructorInjectedController = new ConstructorInjectedController(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImp.HELLO_WORLD, constructorInjectedController.sayHello());
	}

}
