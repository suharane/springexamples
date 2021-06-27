package com.spring;

public class Student {

	// these are propertie of class
	private String studentname;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void showStudentInfo() {
		// printing name of student

		System.out.println("name of student" + studentname);
	}

}
