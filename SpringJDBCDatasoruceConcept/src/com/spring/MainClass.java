package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	
	public static void main(String ar[]) {
	
	
	ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
	
	StudentJDBCDaoImp studentJDBCDaoImp = (StudentJDBCDaoImp)applicationContext.getBean("studentjdbc");
	
	
	     System.out.println("--Record creation---");
	     studentJDBCDaoImp.create("ram","13");
	     studentJDBCDaoImp.create("sham","15");
	     studentJDBCDaoImp.create("ankit","32");
	     
	     //for view of records from db
	     
	     List<Student> student = studentJDBCDaoImp.listStudent();
	     
	     for(Student record:student){
	    	 
	    	 System.out.println(" Id"+record.getId());
	    	 System.out.println(" name"+record.getStudentname());
	    	 System.out.println(" age"+record.getAge());
	     }
	
	}
	
}

