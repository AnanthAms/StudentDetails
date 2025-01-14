package com.example.studentdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	@Query(value="select * from student",nativeQuery=true)
	public List<Student> getAll();
	
	@Query(value="select name from student where rollnumber =?",nativeQuery=true)
	String getname(int a);


	
	@Query(value="select attendance from student where rollnumber=?",nativeQuery=true)
	public int getAttendance(int i);
}
