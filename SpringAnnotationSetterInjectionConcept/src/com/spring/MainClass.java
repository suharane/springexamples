package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// based on annotation
		
				//2. container IOC

				ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);

				// set the emp info from Employee pojo
				Employee employee = applicationContext.getBean(Employee.class);

				employee.setName(" hari");

				System.out.println(employee.getName());

	}

}
