package com.logical.test.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployeeAndDepartment
{
public static void main(String[] args) 
{	
	Department  dept1=new Department(1101, "IT",13);
	Department  dept2=new Department(1101, "HR",35);
	Department  dept3=new Department(1101, "Finance",45);
	Department  dept4=new Department(1101, "Business",18);
	Employee1 emp1=new Employee1(101L, "deepak", "Male", dept1);
	Employee1 emp2=new Employee1(102L, "deepak", "Male", dept2);
	Employee1 emp3=new Employee1(103L, "deepak", "FeMale", dept3);
	Employee1 emp4=new Employee1(104L, "deepak", "FeMale", dept4);
	List<Employee1>empList=new ArrayList<Employee1>();
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	List<String>lis=empList.stream().map(Employee1::getDepartment).filter(p->p.getAge()>30).map(Department::getDeptName).collect(Collectors.toList());
	System.out.println(lis);
	Map<String,Long>count=empList.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
	System.out.println(count);
	
}
}
