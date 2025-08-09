package com.logical.test.array;

public class Department 
{
	private int deptId;
	private String deptName;
	private int age;
	
	
	public Department(int deptId, String deptName, int age) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.age = age;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", age=" + age + "]";
	}
	
	

	
}
