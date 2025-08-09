package com.logical.program.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       /* Queue is an Interface
	        In Java, Queue is an interface that defines the behavior of a queue (like add(), remove(), peek(), etc.).

	        You cannot create an object of an interface directly.

	        You need a class that implements the Queue interface to create an object.

	        2. LinkedList Implements Queue
	        LinkedList is a class that implements the Queue interface.

	        So LinkedList can behave like a queue.
	        public class LinkedList<E> implements List<E>, Deque<E>, Queue<E> {
    // implements many interfaces including Queue
}*/
	        Queue<Integer> queue = new LinkedList<>();

	        int choice;
	        do {
	            System.out.println("1. Push operation");
	            System.out.println("2. Pop operation");
	            System.out.println("3. Display stack");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: // push
	                    System.out.print("Enter element to push: ");
	                    int item = sc.nextInt();
	                    queue.add(item);

	                    // Rearranging the queue to simulate stack
	                    for (int i = 0; i < queue.size() - 1; i++) {
	                        queue.add(queue.remove());
	                    }
	                    break;

	                case 2: // pop
	                    if (queue.isEmpty()) {
	                        System.out.println("Stack underflow");
	                    } else {
	                        System.out.println("Popped: " + queue.remove());
	                    }
	                    break;

	                case 3: // display
	                    if (queue.isEmpty()) {
	                        System.out.println("Stack is empty");
	                    } else {
	                        System.out.println("Stack contents:");
	                        for (int val : queue) {
	                            System.out.println(val);
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 4);
	    }
	}


