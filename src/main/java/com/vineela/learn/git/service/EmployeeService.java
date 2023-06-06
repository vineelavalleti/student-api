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
	
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getEmployees() {
		
		List<Employee> totalEmplopyees = dao.getEmployees();
	
		
		return totalEmplopyees;
		
		
	}
	public List<Employee> getHighPaidEmployees() {
		List<Employee> highPaidEmps = new ArrayList<>();
		
		List<Employee> totalEmplopyees = dao.getEmployees();
		
		for (Employee emp : totalEmplopyees) {
			if (emp.getSal()> 500) {
				highPaidEmps.add(emp);
			}
			
		}
		
		return highPaidEmps;
		
		
	}
	

}
