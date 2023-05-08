package com.ust.practice.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.practice.model.Student;
import com.ust.practice.repository.StudentRepository;

@Service
public class StudentServices {
	@Autowired
	StudentRepository repo;
	
	public Student getStudent(long id) {// retrive
		Optional<Student> optional= repo.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
		}
	public List<Student> getStudents(){//all
		return repo.findAll();
	}
	
//	public Student update(Student stud) {
//		return repo.save(stud);
//	}
	public boolean add(Student stud) {
		 repo.save(stud);
		return true;
	}
//	public void delete(long id) {
//		repo.deleteById(id);
//	}
	
//	public Employee updatebyid(Long id,Employee e) {
//		// TODO Auto-generated method stub
//		Employee emplo=repo.findById(id).orElse(null);
//		emplo.setName(e.getName());
//		emplo.setDesignation(e.getDesignation());
//		Employee update=repo.save(emplo);
//		return update;
//	}
}
