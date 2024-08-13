package com.example.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdetails.entity.Student;
import com.example.studentdetails.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping(value="/post")
	public String postAll(@RequestBody List<Student> s) {
		return ss.postAll(s);
	}
	
	@GetMapping(value="/getStudent")
	public List<Student> getAll(){
		return ss.getAll();
	}
	@GetMapping("/getname/{a}")
	public String getname(@PathVariable int a){
		return ss.getname(a);
	}
	
//	@GetMapping(value="/getroll/{i}")
//	public int getRoll(@PathVariable int i) {
//		return ss.getRoll(i);
//	}
	
	@GetMapping(value="/getAttend/{i}")
	public int getAttendance(@PathVariable int i) {
		return ss.getAttendance(i);
	}
}
