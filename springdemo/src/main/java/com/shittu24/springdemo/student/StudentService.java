package com.shittu24.springdemo.student;

import java.util.List;

public interface StudentService {

	Student save(Student s);
	
	 List<Student> findAll();
	 
	 Student findByEmail(String email);
	 
	 Student update(Student s);
	 
	 void deleteByEmail(String email);
	 
	 
}
