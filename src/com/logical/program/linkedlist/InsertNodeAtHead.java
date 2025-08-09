package com.logical.program.linkedlist;

class LinkedList
{
	//insert node at head
	private Node head;
	
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
	private Node curr;
	public int countNodes()
	{	
		int count=0;
		curr=head;
		while(curr!=null)
		{
			curr=curr.getNext();
			count++;
			
		}
		return count;
	}
	
	//insert node at tail
	public void insertNodesAtTail(int data)
	{	
		Node myNode=new Node(data);	
	}
	
	@Override
	public String toString() {
		if(head==null)
		{
			return "";
		}
		
		return head.toString();
	}
}


public class InsertNodeAtHead 
{
	public static void main(String[] args) {
		LinkedList  headnode=new LinkedList();
		headnode.insertNodeAtHead(100);
		headnode.insertNodeAtHead(200);
		headnode.insertNodeAtHead(300);
		System.out.println(headnode);
		System.out.println(headnode.countNodes());
	}

}
