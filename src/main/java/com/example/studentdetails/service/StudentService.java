package com.example.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.studentdetails.dao.StudentDao;
import com.example.studentdetails.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	
	public String postAll( List<Student> s) {
		return sd.postAll(s);
	}
	
	public List<Student> getAll(){
		return sd.getAll();
	}
	public String getname(int a) {
		return sd.getname(a);
	}

	
//	public int getRoll(int i) {
//		return sd.getRoll(i);
//	}
	
	public int getAttendance( int i) {
		return sd.getAttendance(i);
	}
}
