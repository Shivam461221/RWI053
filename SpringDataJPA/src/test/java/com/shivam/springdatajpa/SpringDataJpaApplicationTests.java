package com.shivam.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shivam.springdatajpa.entities.Student;
import com.shivam.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Shivam");
		student.setTestScore(100);
		
		repository.save(student);
		
		Student savedStudent = repository.findById(1l).get();
		
		assertNotNull(savedStudent);
	}

}
