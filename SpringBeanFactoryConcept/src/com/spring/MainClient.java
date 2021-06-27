package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClient {
	
	
	public static void main(String ar[]) {
		
		// adding to out the resouce that is configuration file
		Resource  resource = new ClassPathResource("applicationContext.xml");
		
		
		//create bean factory container
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		
		//we need to call the service of student
		
		// student object is created by spring container not you.
		
		Student  student =(Student)beanFactory.getBean("studentbean");
		
	//	Student s = new Student();//  Student object is created by spring container internally not you
		
	
		student.StudentInfo();
		
		// create a bean class of  address
		Address add =(Address)beanFactory.getBean("addressbean");
		
		add.AddressInfo();
		
		
		
		
		
	}

}
