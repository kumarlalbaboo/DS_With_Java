package com.logical.program.doublylinklist;

class LinkedList
{
	private Node head;
	private Node curr;
	int count;
	//insert node at head
	public void insertNodeAtHead(int data)
	{
		Node newNode=new Node(data);
		if(head!=null)
		{
			newNode.setNext(head);
			
		}
		head=newNode;	
		
		
	}
	
    //count nodes
	public int  countNodes()
	{
		curr=head;
		while(curr!=null)
		{
			curr=curr.getNext();
			count++;
			
		}
		return count;
		
	}
	//add node at last
	public void insertNodeAtEnd(int data)
	{
		curr=head;
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			
		}
		while(curr.getNext()!=null)
		{
			curr=curr.getNext();
		}
		curr.setNext(newNode);
	}
	public String toString()
	{
		if(head==null)
		{
			return "";
		}
		return head.toString();
	}
}
public class InsertNodeAtHead
{
public static void main(String[] args) 
{
	LinkedList headLinked=new LinkedList();
	headLinked.insertNodeAtHead(100);
	headLinked.insertNodeAtHead(200);
	headLinked.insertNodeAtHead(400);
	headLinked.insertNodeAtHead(500);
	System.out.println(headLinked);
	System.out.println("total nodes="+headLinked.countNodes());
	System.out.println("===============");
	headLinked.insertNodeAtEnd(800);
	System.out.println(headLinked);
}
}
