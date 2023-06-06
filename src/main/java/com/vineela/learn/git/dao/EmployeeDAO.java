package com.vineela.learn.git.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vineela.learn.git.model.Address;
import com.vineela.learn.git.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeDAO {
	
	public List<Employee> getEmployees() {
		log.info("getEmployees method sart in Service ");
		List<Employee> employees = new ArrayList<>();
		
		//Address a = new Address("15102 Summmer", "Wood Lane", 
			//	"Alpharetta", "GA", "30005");
		
		Address a11 = new Address();
		a11.setStreet1("15102 Summ");
		a11.setStreet2("Wood Lane");
		a11.setCity("Alpharetta");
		a11.setState("GA");
		a11.setPostalCode("30005");
		
		
		Employee e = new Employee(100,"Vineela",1000,a11);
		employees.add(e);
		
		Address a1 = new Address("15103 Summmer", "Wood Lane", "Alpharetta", "GA", "30005");
		
		Employee e1 = new Employee(101,"Srinu",100,a1);
		employees.add(e1);
		
		Employee e2 = new Employee(102,"Dinesh",10,a11);
		employees.add(e2);
		log.info("getEmployees method employees count : "+employees.size());
		
		return employees;
		
		
	}
	

}
