package com.spring;

public class HelloWorld {

	// this my bean class

	private String message;

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {

		System.out.println(" Bean is going  to start");
	}

	public void destroy() {

		System.out.println(" Bean is Destory");
	}

}
