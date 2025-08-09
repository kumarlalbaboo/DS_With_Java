/*Scenario 8:
Transaction Management
=======================

For the given transaction data with (payer, payee, amount), calculate
the total amount received by each payee. Here you have to use the grouping 
and Summing concept of Java 8.*/

package com.logical.program.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MyTransaction {
    private String payer;
    private String payee;
    private double amount;

    public MyTransaction(String payer, String payee, double amount) {
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }

    public String getPayer() {
        return payer;
    }

    public String getPayee() {
        return payee;
    }

    public double getAmount() {
        return amount;
    }
}

public class Transaction_Management_Scenario {
    public static void main(String[] args) {
        List<MyTransaction> transactions = Arrays.asList(
                new MyTransaction("Dom", "Mona", 120.0),
                new MyTransaction("Jhon", "Charlie", 150.0),
                new MyTransaction("Bob", "Reha", 210.0),
                new MyTransaction("Jhon", "Mona", 150.0)
        );

        // Method 1 using method reference
        Map<String, Double> totalAmountReceivedByPayee1 = transactions.stream()
                .collect(Collectors.groupingBy(MyTransaction::getPayee, Collectors.summingDouble(MyTransaction::getAmount)));
        System.out.println(totalAmountReceivedByPayee1);
        
        // Method 2 using method reference
        Map<String, Double> totalAmountReceivedByPayee2 = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.getPayee(), Collectors.summingDouble(t -> t.getAmount())));
        System.out.println(totalAmountReceivedByPayee2);
        
    }
}
