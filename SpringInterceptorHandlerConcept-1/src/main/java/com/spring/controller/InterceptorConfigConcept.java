package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class InterceptorConfigConcept extends WebMvcConfigurerAdapter {

	@Autowired
	RequestProcessingTimeInterceptor requestProcessingTimeInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestProcessingTimeInterceptor); 
		// "RequestProcessingTimeInterceptor" added  this interceptor 	
		}
}