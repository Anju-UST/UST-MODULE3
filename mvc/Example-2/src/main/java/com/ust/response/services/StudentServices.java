package com.ust.response.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.response.Repository.StudentRepository;
import com.ust.response.entity.Student;

@Service
public class StudentServices {
	@Autowired
	StudentRepository repo;
	
//create
	public boolean addStudent(Student s) {
		repo.save(s);
		return true;
	}

//fetch by id
	public Student retriveStudent(long id) {
		// TODO Auto-generated method stub
		Optional<Student>opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			return null;
	}

//fetch all
	public List<Student> retriveAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

//update
	public Student updateDetails(long id, Student std) {
		// TODO Auto-generated method stub
		Optional<Student>opt=repo.findById(id);
		if(opt.isPresent()) {
			 opt.get();
			 return repo.save(std);
		}
		else
			return null;
		
	}

//delete
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}