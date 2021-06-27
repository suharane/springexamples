package com.spring1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//  this class is the replacement of  application context xml file

/*
 * 
 * 	
	<bean id="stdId" class="com.spring.Student">
	
	<property name="studentname" value="Ram kumar">
	
	</property>
	</bean>
		
 * 
 */

@Configuration
@ComponentScan("com.spring")
public class EmployeeConfig {
   // this class will tell to spring container that it is bean and  need to be intinilize
	
	@Bean
	public Employee employee() {
		
		return new Employee();

	}

}
