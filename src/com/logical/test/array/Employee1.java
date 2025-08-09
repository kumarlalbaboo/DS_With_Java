package com.logical.test.array;

import java.util.List;

public class Employee1 
{
	private Long empId;
	private String name;
	private String gender;
	private Department department;
	
	public Employee1(Long empId, String name, String gender, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ "]";
	}
	
	
	
	
	
}
