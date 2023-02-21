package org.gl.studentmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.gl.studentmanagement.entity.Student;
import org.gl.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentServiceImpl implements StudentService {
@Transactional
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
}
