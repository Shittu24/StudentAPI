package com.shittu24.springdemo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService{
	
	private final InMemoryStudentDAO dao;

	public InMemoryStudentService(InMemoryStudentDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

	@Override
	public Student save(Student s) {
		return dao.save(s);
	}

	@Override
	public Student findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		return dao.update(s);
	}

	@Override
	public void deleteByEmail(String email) {
		dao.deleteByEmail(email);
	}
	

}
