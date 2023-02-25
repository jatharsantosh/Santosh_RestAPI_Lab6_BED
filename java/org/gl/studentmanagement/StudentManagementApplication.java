package org.gl.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.gl.studentmanagement","org.gl.studentmanagement.controller","org.gl.studentmanagement.service","org.gl.studentmanagement.entity","org.gl.studentmanagement.repository","org.gl.studentmanagement.security"})
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
