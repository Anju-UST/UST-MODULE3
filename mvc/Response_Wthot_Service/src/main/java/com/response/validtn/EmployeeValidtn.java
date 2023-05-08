package com.response.validtn;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeValidtn {
	@NotNull
	private long id;
	@NotNull(message="cant be undefined")
	private String name;
	@Size(max=10)
	private String dept;
	@Max(60000)
	private int sal;
	public EmployeeValidtn() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeValidtn(long id, String name, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeValidtn [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	

}
