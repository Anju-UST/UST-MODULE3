package com.ust.response.Ctrlr;

import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.response.entity.Student;
import com.ust.response.services.StudentServices;


@RestController
@RequestMapping("/api/v2")
public class StudentController {
      @Autowired
	 StudentServices service;
     
 //creating student
      @PostMapping("/create")
  public ResponseEntity<?> createStudent(@RequestBody Student std){
	   boolean str=service.addStudent(std);
	 
	  return  ResponseEntity.ok(str);//or
	  //return new ResponseEntity<>(service.addStudent(std),HTTPStatus.CREATED);
  }
 //fetch by id
      @GetMapping("/fetch/{id}")
      public Student fetchStudent(@PathVariable long id) {
    	  return service.retriveStudent(id);
      }

//fetch all
      @GetMapping("/fetch/all")
      public List<Student> fetchAll() {
    	  return service.retriveAll();
      }
   
 //updating student
      @PutMapping("/update/{id}")
      public ResponseEntity<?> updateStudent(@PathVariable long id,@RequestBody Student std ){
		return ResponseEntity.ok().body(service.updateDetails(id,std));
    	  
      }
 //delete studentdetails
      @DeleteMapping("/delete/{id}")
      public void deleteStudent(@PathVariable long id) {
    	  service.deleteStudent(id);
      }
}
