package com.ust.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.example.dto.EmployeeValidation;
import com.ust.example.exceptions.BlogAlreadyExists;
import com.ust.example.model.Employee;
import com.ust.example.services.EmployeeService;



@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	EmployeeService service;
//creating objects
@PostMapping
@RequestMapping("/create")
public ResponseEntity<?> addEmployee(@RequestBody @Valid EmployeeValidation emp) {
	return new ResponseEntity<>(service.createEmployee(emp),HttpStatus.CREATED);
	
}
//retrieve objects by id
@GetMapping
@RequestMapping("/retrieve/{empid}")
public Employee fetchEmployee(@PathVariable long empid) {
	return service.getEmployee(empid);
}
//retrieve all
@GetMapping
@RequestMapping("/retrieve/all")
public List<Employee>fetchAll(){
	return service.getAll();
}
//updating objects
@PutMapping
@RequestMapping("/update/{id}")
public ResponseEntity<?> updateEmployee(@PathVariable long id,@RequestBody @Valid EmployeeValidation emp) throws BlogAlreadyExists{
	boolean employee=service.updateEmployeeDetails(id,emp);
	return  ResponseEntity.ok(employee);
}
//Delete objects
@DeleteMapping("/delete/{id}")
public void deleteEmp(@PathVariable Long id) {
	service.deleteEmployee(id);
}
}

