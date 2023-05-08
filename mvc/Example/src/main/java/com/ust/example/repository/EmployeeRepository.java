package com.ust.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
