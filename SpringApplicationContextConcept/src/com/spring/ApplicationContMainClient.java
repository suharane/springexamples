package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContMainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //spring has two types of container
		//1. BeanFactory
		//2. ApplicationContext
		
		ApplicationContext context =  new 	ClassPathXmlApplicationContext("applicationContext.xml");
		
		// create the refernce for student
		
		Student s=(Student)context.getBean("stdId");
		
		s.showStudentInfo();

	}

}
