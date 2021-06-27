package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentJDBCRowMapper implements RowMapper<Student> {

	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();// create a object for student class or bean

		student.setId(rs.getInt("id"));
		student.setStudentname(rs.getString("name"));
		student.setAge(rs.getString("age"));

		return student;

	}

}
