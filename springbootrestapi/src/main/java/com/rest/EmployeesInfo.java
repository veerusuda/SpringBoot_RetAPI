package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesInfo {
	
	@Autowired
	EmployeeRepo empRepo;
	
	@GetMapping("fetchEmployeeInfo")
	public List<Employee> getEmployees() {
		
		List<Employee> empList = (List<Employee>) empRepo.findAll();
		
		return empList;
	}
	
	
}
