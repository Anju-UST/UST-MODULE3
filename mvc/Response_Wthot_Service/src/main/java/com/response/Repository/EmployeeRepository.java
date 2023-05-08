package com.response.Repository;

import org.springframework.stereotype.Repository;

import com.response.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
