package com.ust.practice.Ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.practice.Services.StudentServices;
import com.ust.practice.model.Student;


@RestController
@RequestMapping("/student/api.2.0")
public class StudCtrlr {
	@Autowired
	StudentServices service;
	
	
	
	@PostMapping
	@RequestMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<?> addStudent(@RequestBody Student stud){
		boolean result=service.add(stud);
		if(result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		}
		else
			return ResponseEntity.status(HttpStatus.CREATED).body(false);
		
	}
	
	@GetMapping
	@RequestMapping("/retrieve/all")
	public List<Student> fetchStudents(){
		return service.getStudents();
	}
	
	@GetMapping
	@RequestMapping("/retrieve/{id}")
	public Student fetchStudent(@PathVariable long id) {
		return service.getStudent(id);
	}
//	@PutMapping("/emp3/{id}")
//	public Employee updateid(@PathVariable Long id,@RequestBody Employee e) {
//		Employee up= services.updatebyid(id,e);
	//return up;
//	}
	
	
}
