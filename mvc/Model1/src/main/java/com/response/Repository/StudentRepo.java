package com.response.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.response.Model.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Long>{

}
