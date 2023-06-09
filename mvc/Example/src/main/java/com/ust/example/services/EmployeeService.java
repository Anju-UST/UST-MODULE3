package com.ust.example.services;

	import java.util.List;
	import java.util.Optional;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.ust.example.dto.EmployeeValidation;
import com.ust.example.exceptions.BlogAlreadyExists;
import com.ust.example.model.Employee;
	import com.ust.example.repository.EmployeeRepository;

	@Service
	public class EmployeeService {
		@Autowired
		EmployeeRepository repo;
		
		public Employee createEmployee( EmployeeValidation emp) {
			Employee employee=new Employee(emp.getId(),emp.getName(),emp.getDept(),emp.getSal());
			
			return repo.save(employee);
		}

		public boolean updateEmployeeDetails(long id, EmployeeValidation emp) throws BlogAlreadyExists {
			// TODO Auto-generated method stub
			Employee ep=null;
			Optional<Employee> optional=repo.findById(emp.getId());
			if(optional.isPresent()) {
				ep=optional.get();
				ep.setId(emp.getId());
				ep.setName(emp.getName());
				ep.setDept(emp.getDept());
				ep.setSal(emp.getSal());
				repo.save(ep);
				return true;
			}
			else {
				throw new BlogAlreadyExists("No such Id ");
			}
			
		}

		public Employee getEmployee(long empid) {
			// TODO Auto-generated method stub
			Optional<Employee>opt=repo.findById(empid);
			if(opt.isPresent())
			      return opt.get();
			else
				return null;
		}
			
		public List<Employee> getAll() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}

		public void deleteEmployee(Long id) {
			// TODO Auto-generated method stub
			repo.deleteById(id);
			
		}

}
