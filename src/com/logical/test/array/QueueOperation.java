package com.logical.test.array;

import java.util.Scanner;
//implement using stack
public class QueueOperation 
{
	public static void main(String[] args) 
	{
		int front=0,rear=-1,item,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter queue size");
		int max_size=sc.nextInt();
		int q[]=new int[max_size];
		do
		{
			System.out.println("enter your choice");
			System.out.print("1.Insert\n");
			System.out.print("2.Delete\n");
			System.out.print("3.Display\n");
			System.out.print("4.Exit\n");
			ch=sc.nextInt();
			if(ch==1)
			{
				if(rear==max_size-1)
				{
					System.out.println("fullll");
				}
				else
				{
					System.out.println("enter element in queue");
					item=sc.nextInt();
					q[++rear]=item;
				}
			}
			else if(ch==2)
			{
				if(front>rear)
				{
					System.out.println("queue is empty");
				}
				else
				{
					System.out.println("deleted element"+q[front++]);
				}
			}
			else
			{
				for(int i=front;i<=rear;i++)
				{
					System.out.print(q[i]);
				}
			}
			
		}while(ch!=4);
		
	}

}
