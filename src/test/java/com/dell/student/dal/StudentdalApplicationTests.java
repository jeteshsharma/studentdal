package com.dell.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dell.student.dal.entities.Student;
import com.dell.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent(){
		
		Student student =new Student();
		student.setName("studentOne");
		student.setCourse("hindi");
		student.setFee(500d);

		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById(){
		Optional<Student> studentOptional=studentRepository.findById((long) 1);
		Student student=null;
		if(studentOptional.isPresent())
			 student=studentOptional.get();
		System.out.println(student); 
	}
	
	@Test
	public void testUpdateStudentById(){
		Optional<Student> studentOptional=studentRepository.findById((long) 2);
		Student student=null;
		if(studentOptional.isPresent())
			 student=studentOptional.get();
		student.setFee(600d);
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent(){
		Student student =new Student();
		student.setId(3L);
		studentRepository.delete(student);
	}

}
