package com.vineela.learn.git;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.lenient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vineela.learn.git.model.Student;
import com.vineela.learn.git.service.CalculatorServcie;
import com.vineela.learn.git.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServcieTest {
	
	
	
	@Test
	public void studentService_getStudent_success() {
		StudentService ser = new StudentService();
		Student student = ser.getStudent();
		assertNotNull(student);
		assertTrue(student.getId() > 0);
		assertTrue(student.getName() != "" && student.getName().length() > 2);
		
	}
	
	@Test
	public void studentService_getStudent_success1() {
		StudentService ser = new StudentService();
		Student student = ser.getStudent();
		assertNotNull(student);
		assertTrue(student.getId() > 0);
		assertTrue(student.getName() != "" && student.getName().length() > 2);
		
	}
	
	
	

}
