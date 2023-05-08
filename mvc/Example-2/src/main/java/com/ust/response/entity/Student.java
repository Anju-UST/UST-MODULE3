package com.ust.response.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
   private long id;
   private String name;
   private String dept;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Student(long id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}
   
}