package com.spring;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

 
public class MainClass {
 
    public static void main(String a[]){
         
        String confFile = "beans.xml";
        ConfigurableApplicationContext context = 
                                new ClassPathXmlApplicationContext(confFile);
        
        EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
        
        Employee emp = empDao.findEmployeeById(1);// get emp by his id
        
        System.out.println(emp.getName()+" | "+emp.getSalary()+" | "+emp.getDept());
        
        System.out.println("-----------------------------------------------");
        List<Employee> empList = empDao.findAllEmployees();
        
        for(Employee em:empList){
        	
            System.out.println(em.getName()+" | "+em.getSalary()+" | "+em.getDept());
        }
    }
}