package com.vineela.learn.git.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vineela.learn.git.dao.EmployeeDAO;
import com.vineela.learn.git.model.Address;
import com.vineela.learn.git.model.Employee;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class EmployeeService {
	
	
	public static List<Employee> totalEmplopyees = new ArrayList<>();
	
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getEmployees() {
		
		totalEmplopyees = dao.getEmployees(totalEmplopyees);
	
		
		return totalEmplopyees;
		
		
	}
	public List<Employee> getHighPaidEmployees() {
		List<Employee> highPaidEmps = new ArrayList<>();
		
		List<Employee> totalEmplopyees1 = dao.getEmployees(totalEmplopyees);
		
		for (Employee emp : totalEmplopyees1) {
			if (emp.getSal()> 500) {
				highPaidEmps.add(emp);
			}
			
		}
		
		return highPaidEmps;
		
		
	}
	
	public void createEmployee(Employee emp) {
		totalEmplopyees.add(emp);
	}
	
	
	

}
