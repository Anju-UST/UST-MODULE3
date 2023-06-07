package com.response.Ctrlr;

import java.util.List;
import java.util.Optional;

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

import com.response.Employee.Employee;
import com.response.Exceptions.BlogAlreadyExists;
import com.response.Repository.EmployeeRepository;
import com.response.validtn.EmployeeValidtn;
@RestController
@RequestMapping("/employee")
public class ControllerwithService {
	@Autowired 
	EmployeeRepository repo;

//	public boolean addStudent(Student s) {
//		repo.save(s);
//		return true;
//	}
	
	@PostMapping
	@RequestMapping("/create")
	public ResponseEntity<?> createEmployee(@RequestBody @Valid EmployeeValidtn emp ){
		Employee employee=new Employee(emp.getId(),emp.getName(),emp.getDept(),emp.getSal());
		repo.save(employee);
		//return ResponseEntity.ok(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	
	@GetMapping
	@RequestMapping("/retrieve/{id}")
	public ResponseEntity<?>findEmployee(@PathVariable long id) {
		Optional<Employee> op=repo.findById(id);
		if(op.isPresent()) { 
				
			return ResponseEntity.ok().body(op.get());
		}
		else
			return ResponseEntity.noContent().build();
		
	}
	@GetMapping
	@RequestMapping("/retrieve/all")
	public List<Employee>fetchall(){
		return repo.findAll();
		
	}
	@PutMapping
	@RequestMapping("/update/{id}")
	public ResponseEntity<?>Updatebyid(@RequestBody @Valid EmployeeValidtn emp, @PathVariable long id)throws BlogAlreadyExists
	{
		Employee ep=null;
		Optional<Employee> op=repo.findById(id);
		if(op.isPresent()) {
			ep=op.get();
			ep.setDept(emp.getDept());
			ep.setName(emp.getName());
			ep.setSal(emp.getSal());
			repo.save(ep);
			return ResponseEntity.ok().body(ep);
				
		}
		else
			throw new BlogAlreadyExists("No such Id ");
	
		
	}
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public String deletebyid(@PathVariable Long id) {
		Optional<Employee>op=repo.findById(id);
		if(op.isPresent()) {
			repo.deleteById(id);
		return "deleted";
		
		}
		else
			return "not found";
		
	}
	

}
