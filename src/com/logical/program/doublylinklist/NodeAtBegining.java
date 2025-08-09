package com.logical.program.doublylinklist;

class LinkedList1 {
    private Node head;
    private Node curr;
    int count;

    // Insert node at head
    public void insertNodeAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    // Count nodes
    public int countNodes() {
        count = 0; // Reset count before starting
        curr = head;
        while (curr != null) {
            curr = curr.getNext();
            count++;
        }
        return count;
    }

    // Insert node at end
    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
    }

    // Insert node at specific position (0-based index)
    public void insertNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0 || head == null) {
            insertNodeAtHead(data);
            return;
        }

        curr = head;
        int index = 0;

        // Traverse until the node just before the desired position
        while (curr != null && index < position - 1) {
            curr = curr.getNext();
            index++;
        }

        // If position is greater than length, insert at end
        if (curr == null || curr.getNext() == null) {
            insertNodeAtEnd(data);
        } else {
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
    }

    public String toString() {
        if (head == null) {
            return "";
        }
        return head.toString();
    }
}



public class NodeAtBegining {
	
	public static void main(String[] args) 
	{
		LinkedList1 headLinked=new LinkedList1();
		headLinked.insertNodeAtPosition(300, 2); // Insert 300 at position 2
		System.out.println(headLinked);

	}
}
	
	