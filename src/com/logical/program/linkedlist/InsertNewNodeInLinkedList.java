package com.logical.program.linkedlist;

class Node
{
	private int data;
	private Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		setNext(null);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return String.valueOf(data)+"->"+(next==null?null:next.toString());
	}
	
	
}
public class InsertNewNodeInLinkedList
{
		
	public static void main(String[] args) {
		Node node1=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		System.out.println(node1);
		System.out.println(node2);
		System.out.println(node3);
		node1.setNext(node2);
		node2.setNext(node3);
		System.out.println(node1);
		
	}
		

}
