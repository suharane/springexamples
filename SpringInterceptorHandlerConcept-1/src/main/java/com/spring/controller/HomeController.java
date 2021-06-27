package com.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger; // pls import this class
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// this line is resposible for generating logs which is the backbone application
	private static final Logger loggger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/home")
	public String home(Locale locale, Model model) {

		loggger.info("wel come home)" + locale); //  generate the logs of 
		
		System.out.println(" i am from home controller");

		Date date = new Date();

		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattDate = dateFormat.format(date);

		model.addAttribute("server time" + formattDate); // this api comes from jar webmvc dependecy

		loggger.info("before retuirn view oage");

		return "home"; // this need display in jsp

	}

}
