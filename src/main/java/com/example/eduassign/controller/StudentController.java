package com.example.eduassign.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eduassign.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/details/")
	public List<Student> getStudents(){
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student(101,"shivam","sharma","shivam11003@gmail.com"));
		slist.add(new Student(102,"priyanshu","shrama","@gmail.com"));
		return slist;
		
	}
	@GetMapping("/details/{StudentId}")
	public Student getbyid(@PathVariable int StudentId){
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student(101,"shivam","sharma","shivam11003@gmail.com"));
		slist.add(new Student(102,"priyanshu","shrama","@gmail.com"));
		return slist.get(StudentId);
		
	}
	
	
	
	
}
