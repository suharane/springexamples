package com.spring;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	// what is DAO Direct access object
	
	public void setDatasource(DataSource ds);// this method will set the db driver info
	
	public void create(String name,String age);
	
	public List<Student> listStudent();// list of student need to fetch from db

}
