package com.hostmdy.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ContextController {
	public String sayHello() {
		return "Hello from contextController";
	}
}
