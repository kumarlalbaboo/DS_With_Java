
/*Scenario 3:
Product Inventory Management
=============================
Suppose in a Product Inventory We have a list of products with (name, price, quantity).
You have to calculate the total cost of all products which are in stock.*/

package com.logical.program.jdk8;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;
    private double price;
    

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
}

public class ProductEnventoryManagement_Scenario {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("radio", 99.0, 0));
        product.add(new Product("television", 82.0, 3));
        product.add(new Product("earbud", 82.5, 5));
        product.add(new Product("charger", 88.5, 0));
        product.add(new Product("mobile", 99.5, 2));

        //method 1 using sum()
        double totalCost = product.stream().filter(q->q.getQuantity()>0).mapToDouble(p->p.getQuantity()*p.getPrice()).sum();
        System.out.println("Total cost of all instock products = "+ totalCost);
        
        //method 2 using Double::sum
        double totalCost1 = product.stream().filter(q->q.getQuantity()>0).mapToDouble(p->p.getQuantity()*p.getPrice()).reduce(0,Double::sum);
        System.out.println("Total cost of all instock products = "+totalCost1);
        
    }
}