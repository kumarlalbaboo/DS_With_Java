package com.logical.program.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueusingStack {
	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		Scanner sc = new Scanner(System.in);
		int choice, item;

		do {
			System.out.println("1. INSERT (Enqueue)");
			System.out.println("2. DELETE (Dequeue)");
			System.out.println("3. DISPLAY");
			System.out.println("4. EXIT");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: // enqueue
				System.out.print("Enter element to insert: ");
				item = sc.nextInt();
				stack1.push(item);
				break;

			case 2: // dequeue
				if (stack1.isEmpty() && stack2.isEmpty()) {
					System.out.println("Queue underflow");
				} else {
					if (stack2.isEmpty()) {
						while (!stack1.isEmpty()) {
							stack2.push(stack1.pop());
						}
					}
					System.out.println("Deleted element: " + stack2.pop());
				}
				break;

			case 3: // display
				if (stack1.isEmpty() && stack2.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Queue elements:");
					// Print stack2 (already reversed order)
					for (int i = stack2.size() - 1; i >= 0; i--) {
						System.out.println(stack2.get(i));
					}
					// Print stack1 (normal order)
					for (int i = 0; i < stack1.size(); i++) {
						System.out.println(stack1.get(i));
					}
				}
				break;

			case 4:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice");
			}

		} while (true);
	}
}
