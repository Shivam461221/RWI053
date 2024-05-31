package com.shivam.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
