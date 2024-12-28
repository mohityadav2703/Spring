package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,String>{

}
