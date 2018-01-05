package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employees {
	
	
	@GetMapping("fetchEmployee")
	public List<Employee> getEmployees() {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("John");
		e1.setCompany("Allstate");
		e1.setDesignation("Consultant");
		
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("Smith");
		e2.setCompany("Allstate");
		e2.setDesignation("Lead Consultant");
		
		empList.add(e1);
		empList.add(e2);
		
		return empList;
	}
	
	
}
