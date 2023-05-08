package com.response.Ctrlr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.response.Exceptions.BlogAlreadyExists;
import com.response.Model.Student;
import com.response.Repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentCtrlr {
	
	@Autowired
	StudentRepo repo;
	
	@PostMapping
	@RequestMapping("/create")
	public ResponseEntity<?> create(@RequestBody Student s){
		repo.save(s);
		return ResponseEntity.ok().body(s);
	}
	
	@GetMapping
	@RequestMapping("/get/{id}")
	public ResponseEntity<?> getid(@PathVariable Long  id){
		Optional<Student> op=repo.findById(id);
		if(op.isPresent()) {
			return ResponseEntity.ok().body(op);
		}
		else
			return null;
		
	}

	@GetMapping
	@RequestMapping("/get/all")
	public List<Student> getall(){
		return repo.findAll();
		
	}
	
	@PutMapping
	@RequestMapping("/update/{id}")
	public ResponseEntity<?> updateid(@RequestBody Student s, @PathVariable Long id)throws BlogAlreadyExists{
		Student st=null;
		Optional<Student>op=repo.findById(id);
		if(op.isPresent()) {
			st=op.get();
			st.setAge(s.getAge());
			st.setName(s.getName());
			
			return ResponseEntity.ok(repo.save(st));
		}
		else
			throw new BlogAlreadyExists("No such Id ");
	}
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id)throws BlogAlreadyExists {
		Optional<Student> op= repo.findById(id);
		if(op.isPresent()) {
			repo.deleteById(id);
			return "deleted";
		}
		else
			throw new BlogAlreadyExists("no id");
			
		}
	
	

}
