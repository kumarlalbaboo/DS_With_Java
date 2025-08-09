/*
 Scenario 7:
 Word Count
 ==========
Perform Word Count for the given paragraph and print the occurrences of
each word using a Java Map and Java 8.
 
 */

package com.logical.program.jdk8;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
public class WordCountInString {
    public static void main(String[] args) {
        String paragraph = "Her friends always walked hand in hand with her in her difficult times.";
        
        //Method 1
        List<String> stringArray = Arrays.asList(paragraph.toLowerCase().split(" "));
        Map<String, Long> wordCount1= stringArray.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
        System.out.println("Output 1:");
        System.out.println(wordCount1);
        
        
        //Method 2
        Map<String, Long> wordCount2= Arrays.stream(paragraph.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Output 2:");
        System.out.println(wordCount2);
        
    }
}
