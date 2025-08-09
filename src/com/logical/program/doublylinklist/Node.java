package com.logical.program.doublylinklist;

public class Node 
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
