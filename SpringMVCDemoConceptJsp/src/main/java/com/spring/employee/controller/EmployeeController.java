package com.spring.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employee.model.Employee;

// added annotation to call controller
/**
 * @author Mantha Chakradhar
 *
 */
@RestController
public class EmployeeController {


    @GetMapping(value="/employeelistdetails")
	public ArrayList<Employee> getEmployeListDetails() {

		ArrayList<Employee> listofemplolyee = new ArrayList<Employee>(); // value are coming from db

		for (Employee empployee : listofemplolyee) {

			empployee.setEmpage("12");

			empployee.setEmpname("Ram");

			listofemplolyee.add(empployee);
		}

		return listofemplolyee;

	}

}
