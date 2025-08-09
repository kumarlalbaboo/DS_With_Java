/*
Scenario 5:
Data Transformation
===================
Here we are moving to the next topic to see some new concepts of
Data Transformation using Java 8.
We have Given a list of strings and we have to convert them 
to uppercase using Java 8 streams.
 */

package com.logical.program.jdk8;

import java.util.*; 
import java.util.stream.Collectors;
public class Data_Transformation_Scenario
 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "python", "react", "javascript");
        
        //method 1
        List<String> upperCaseString = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Output 1:");
        System.out.println(upperCaseString);
        
        
        //method2
        System.out.println("Output 2:");
        strings.stream().map(String::toUpperCase).collect(Collectors.toList()).
                                       forEach(System.out::println);
    }
}