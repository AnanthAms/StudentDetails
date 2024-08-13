package com.example.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.studentdetails.entity.Student;
import com.example.studentdetails.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository sr;
	
	public String postAll( List<Student> s) {
		 sr.saveAll(s);
		 return "posted Success";
	}
	
	public List<Student> getAll(){
		return sr.getAll();
	}
	public String getname(int a) {
		return sr.getname(a);
	}

	
//	public int getRoll( int i) {
//		return sr.getRoll(i);
//	}
	
	public int getAttendance( int i) {
		return sr.getAttendance(i);
	}
}
