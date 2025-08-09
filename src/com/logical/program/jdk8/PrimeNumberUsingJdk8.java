package com.logical.program.jdk8;

/*Scenario 10:
Prime number
=============

Print the list of all prime numbers in the given range 
using Java 8.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class PrimeNumberUsingJdk8 {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;
        List<Integer> primeNumbers = generatePrimeNumbers(start, end);
        System.out.println(primeNumbers);
    }

    public static List<Integer> generatePrimeNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(PrimeNumberUsingJdk8::isPrimeNumber)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}