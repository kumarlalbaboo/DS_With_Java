

/*Scenario 2:
Student Grades System
=====================

There is a list of students with their (name, grades). 
We have to find the name of the student who has the highest grade.*/

package com.logical.program.jdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

class Student {
    private String name;
    private double grades;

    public Student(String name, double grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double getGrades() {
        return grades;
    }
}

public class StudentGradeSystem_scenario {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pawan", 99.0));
        students.add(new Student("Nishant", 82.0));
        students.add(new Student("Charlie", 82.5));
        students.add(new Student("Rob", 88.5));
        students.add(new Student("Daniel", 99.5));

        //else throw null
        Student studentWithHighestGrade1 = students.stream()
                .max(Comparator.comparingDouble(Student::getGrades))
                .orElse(null);
         
        if (studentWithHighestGrade1 != null) {
            System.out.println("(First Method) Student with the highest grade:");
            System.out.println("Name: " + studentWithHighestGrade1.getName());
            System.out.println("Grade: " + studentWithHighestGrade1.getGrades());
        }else{
            System.out.println("No student found.");
        }
        
        //else throw NoSuchElementException
        Student studentWithHighestGrade2 = students.stream()
                .max(Comparator.comparingDouble(Student::getGrades))
                .orElseThrow(NoSuchElementException::new);
         
        if (studentWithHighestGrade2 != null) {
            System.out.println("(Second Method) Student with the highest grade:");
            System.out.println("Name: " + studentWithHighestGrade2.getName());
            System.out.println("Grade: " + studentWithHighestGrade2.getGrades());
        }else{
            System.out.println("No student found.");
        }
        
    }
}
