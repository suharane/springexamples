package com.spring;

//pojos

public class Student {

	private String studentname;
	private String rollnumber;
	private String age;
	
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
	// method for display student info
	
	public void StudentInfo() {
		
		System.out.println("name of student  "+studentname);
		System.out.println("name of roll  number  "+rollnumber);
		System.out.println("name of age  "+age);
		
	}
	
	
	
}
