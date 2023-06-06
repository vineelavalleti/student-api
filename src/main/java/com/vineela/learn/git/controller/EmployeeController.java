package com.vineela.learn.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vineela.learn.git.model.Employee;
import com.vineela.learn.git.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/emp")
	public List<Employee> getStudents() {
		log.info("Hello Method Start in Controller");
		
		// Input Valudadtyion 
		
		
		// Call Service and get List of Employees
		List<Employee> employees = empService.getEmployees();
		
		log.info("Hello Method End in Controller");
		
		return employees;
		
	}

	@GetMapping("/highpaidemps")
	public List<Employee> getHighPaidEmps() {
		log.info("Hello Method Start in Controller");
		
		// Input Valudadtyion 
		
		
		// Call Service and get List of Employees
		List<Employee> employees = empService.getHighPaidEmployees();
		
		log.info("Hello Method End in Controller");
		
		return employees;
		
	}
	
	@PostMapping("/emp")
	public List<Employee> createEmp(@RequestBody Employee emp) {
		
		empService.createEmployee(emp);
		//List<Employee> employees = empService.getEmployees();
		List<Employee> employees = empService.totalEmplopyees;
		log.info("Hello Method End in Controller");
		
		return employees;
		
	}

}
