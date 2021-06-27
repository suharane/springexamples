package com.spring;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	
	public static void main(String ar[]) {
		
		
		AbstractApplicationContext  applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("hellobean");
		
		helloWorld.getMessage();
		
		
		applicationContext.registerShutdownHook();
		
		
	}

}
