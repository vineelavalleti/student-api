package com.vineela.learn.git.service;

import com.vineela.learn.git.model.Student;

public class StudentService {
	
	public Student getStudent() {
		Student s = new Student();
		s.setId(100);
		s.setName("Vineela");
		return s;
	}

}
