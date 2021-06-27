package com.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCDaoImp implements StudentDAO {
	
	private DataSource datasourceprop;
	private JdbcTemplate jdbcTemplateObject;



	public void setDatasource(DataSource ds) {

		this.datasourceprop = ds;
		this.jdbcTemplateObject = new JdbcTemplate(datasourceprop);
		
	}
	
	
// user defined method
	public List<Student> listStudent() {
		
		String sql="select * from Student";
		
		List<Student> student = jdbcTemplateObject.query(sql, new StudentJDBCRowMapper());
	
		return student;
	}




	public void create(String name, String age) {
		
		String sql ="insert into Student(name,age) values(?,?)";
		jdbcTemplateObject.update(sql,name,age);
		return;
		
	}






}
