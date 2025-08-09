/*
 Scenario 6:
Filtering and Sorting on Data

For the given list of elements, perform Filtering and Sorting on the elements.
Write a java 8 program to perform operations like filter out 
the even numbers from list and sort the remaining ones in ascending order.
 
 */

package com.logical.program.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndSorting_Scenario {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,34,22,13,55,4,3,87,11,22,12);
        System.out.println("Unsorted Unfiltered List = " + numbers);
        List<Integer> filteredAndSortedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0).sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Filtered List = " + filteredAndSortedNumbers);
    }
}
