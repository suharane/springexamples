package com.spring.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eg of constructor based

				// adding to out the resouce that is configuration file
				Resource resource = new ClassPathResource("applicationContext.xml");

				// create bean factory container

				BeanFactory beanFactory = new XmlBeanFactory(resource);

				// we need to call the service of student

				// Employee object is created by spring container not you.

				Employee employee = (Employee) beanFactory.getBean("empbean");
				
				employee.EmpInfo();

	}

}
