
/*Scenario 1:

Employee Management System
==========================
We have a list of employees with (name, age, salary). 
Your task is to write a program to find the average salary of
employees older than 20 using Java 8.*/

package com.logical.program.jdk8;

import java.util.Arrays;
import java.util.List;

class EmployeeRecord
{
    private String name;
    private int age;
    private double salary;
    
    EmployeeRecord(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
}
public class EmployeeManagementSystem_Scenario 
{
	public static void main(String ...a){
        List<EmployeeRecord> employees = Arrays.asList(new EmployeeRecord("rajesh",23,23000),new EmployeeRecord("mohan",21,29000), new EmployeeRecord("amrita",25,13000) );
        
        double d = employees.stream().filter(s->s.getAge()>20).mapToDouble(s->s.getSalary()).average().orElse(0.0);
        
        System.out.println("Sum of Employee Salary is: " + d);
        
     // Sorting employee based on names using Java 8 streams
        
    }
}
