package com.logical.program.jdk8;

/*Scenario 9:
Stream Chaining
===============

Given a list of strings, filter out the ones containing a
specific substring and then concatenate them into a single string.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Chaining_Scenario {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("pablo", "laptop", "kiwi", "mouse", "paces");
        String subString = "pa";
        String concatenatedString = string.stream()
                .filter(s -> s.contains(subString))
                .collect(Collectors.joining());
        System.out.println(concatenatedString);
    }
}
