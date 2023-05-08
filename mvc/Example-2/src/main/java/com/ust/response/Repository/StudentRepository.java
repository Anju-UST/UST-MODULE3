package com.ust.response.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.response.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}