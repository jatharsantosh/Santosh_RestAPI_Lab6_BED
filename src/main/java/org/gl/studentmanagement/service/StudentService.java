package org.gl.studentmanagement.service;

import java.util.List;

import org.gl.studentmanagement.entity.Student;

public interface StudentService {
	public List<Student> findAll();
	
	public Student findById(int theId);
	
	public void save(Student theStudent);
	
	public void deleteById(int theId);

}
