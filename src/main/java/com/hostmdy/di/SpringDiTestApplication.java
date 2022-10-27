package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.ConstructorInjectedController;
import com.hostmdy.di.controller.ContextController;
import com.hostmdy.di.controller.PropertyInjectedController;
import com.hostmdy.di.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiTestApplication.class, args);
		
		ContextController contextController = (ContextController) context.getBean("contextController");
		System.out.println("Form ContextController : "+contextController.sayHello());
		
		PropertyInjectedController propertyInjBean = context.getBean(PropertyInjectedController.class);
		System.out.println("From PropertyInjController : "+propertyInjBean.sayHello());
		
		SetterInjectedController setterInjBean = context.getBean(SetterInjectedController.class);
		System.out.println("From SetterInjController : "+setterInjBean.sayHello());
		
		ConstructorInjectedController constructorInjBean = context.getBean(ConstructorInjectedController.class);
		System.out.println("From ConstructorinjController : "+constructorInjBean.sayHello());
	}

}
