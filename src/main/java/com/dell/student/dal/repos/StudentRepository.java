package com.dell.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.dell.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
