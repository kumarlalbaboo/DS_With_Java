package com.logical.program.jdk8;

/*Scenario 11:
Sales Management Revenue

In the retail marketplace, there are multiple transactions that happen from time to time. 
We have to perform the data analysis over the revenue.

For the Given list of sales transactions (transactionID, productID, quantity, price),
you have to find the top N products (by revenue) sold in the last 3 months using Java 8.

Here N is the number of products that you want.*/

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    private String transactionID;
    private String productID;
    private int quantity;
    private double price;
    private LocalDate transactionDate;
    
    public Transaction(){
        
    }
    public Transaction(String transactionID, String productID, int quantity, double price, LocalDate transactionDate){
        this.transactionID = transactionID;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
        this.transactionDate = transactionDate;
    }

    public LocalDate getTransactionDate(){
        return transactionDate;
    }
    
    public String getTransactionID(){
        return transactionID;
    }
    
    public String getProductID(){
        return productID;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice(){
        return price;
    }

}

public class Sales_Management_Revenue_Scenario {
    public static void main(String[] args) {
        List<Transaction> salesTransactions = new ArrayList<>(); 
        salesTransactions.add(new Transaction("1","1",10,23.9,LocalDate.now()));
        salesTransactions.add(new Transaction("2","1",11,21.9,LocalDate.now()));
        salesTransactions.add(new Transaction("3","2",12,21.9,LocalDate.now()));
        salesTransactions.add(new Transaction("4","3",11,24.9,LocalDate.now()));
        salesTransactions.add(new Transaction("5","3",4,23.9,LocalDate.now()));
        salesTransactions.add(new Transaction("6","3",5,26.9,LocalDate.now()));
        salesTransactions.add(new Transaction("7","2",6,27.9,LocalDate.now()));
        salesTransactions.add(new Transaction("8","1",12,28.9,LocalDate.now()));
        
        int N = 2; // Number of top products
        
        LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
        
        Map<String, Double> productRevenueMap = salesTransactions.stream()
            .filter(transaction -> transaction.getTransactionDate().isAfter(threeMonthsAgo))
            .collect(Collectors.groupingBy(
                Transaction::getProductID,
                Collectors.summingDouble(transaction -> transaction.getPrice() * transaction.getQuantity())
            ));
        
        List<Map.Entry<String, Double>> sortedProductsByRevenue = productRevenueMap.entrySet().stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .limit(N)
            .collect(Collectors.toList());
        
        System.out.println("Top " + N + " products by revenue in the last 3 months:");
        for (Map.Entry<String, Double> entry : sortedProductsByRevenue) {
            System.out.println("ProductID: " + entry.getKey() + ", Revenue: " + entry.getValue());
        }
    }
}