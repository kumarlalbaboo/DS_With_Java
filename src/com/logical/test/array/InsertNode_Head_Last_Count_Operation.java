package com.logical.test.array;

class LinkedList
{
	private Node head;
	private Node curr;
	int count=0;
	
	public void insertNodeAtHead(int data)
	{
		Node newnode=new Node(data);
		if(head!=null)
		{
			newnode.setNext(head);
		}
		head=newnode;	
	}
	
	public int countNodes()
	{
		curr=head;
		while(curr!=null)
		{
			curr=curr.getNext();
			count++;
		}
		return count;
	}
	
	public void insertNodeAtEnd(int data)
	{
		curr=head;
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		while(curr.getNext()!=null)
		{
			curr=curr.getNext();
		}
		curr.setNext(newnode);
	}
	
	//Need to implement insert node at middle
	
	//Reverse the node
	
	public String toString()
	{
		if(head==null)
		{
			return "";
		}
		return head.toString();
	}
	
}

public class InsertNode_Head_Last_Count_Operation 
{
	public static void main(String[] args)
	{
		LinkedList linkedList=new LinkedList();
		linkedList.insertNodeAtHead(100);
		linkedList.insertNodeAtHead(200);
		linkedList.insertNodeAtHead(300);
		System.out.println(linkedList);
		System.out.println(linkedList.countNodes());
		linkedList.insertNodeAtEnd(700);
		System.out.println(linkedList);
		linkedList.insertNodeAtEnd(800);
		System.out.println(linkedList);
		
	}

}
