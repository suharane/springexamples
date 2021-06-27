package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
	
	

 /// this is for ui jsp page or html
    @RequestMapping(value = { "/testJsp" }, method = RequestMethod.GET)
    public String testJspView() {
     return "testJsp";
    }
    
    
    @RequestMapping(value = { "/testThymeleaf" }, method = RequestMethod.GET)
    public String testThymeleafView() {
 
        return "th_page1";
    }
      
}