package com.shittu24.springdemo.student;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DBStudentService implements StudentService  {
	
	private final StudentRepository repository;

	public DBStudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Student save(Student s) {
		return repository.save(s);
	}

	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		return repository.save(s);
	}

	@Override
	public void deleteByEmail(String email) {
		repository.deleteByEmail(email);
	}

}
