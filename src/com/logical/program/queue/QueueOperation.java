package com.logical.program.queue;

import java.util.Scanner;

public class QueueOperation 
{
	public static void main(String[] args)
	{
		int front=0,rear=-1,item,choice;
		System.out.println("enter Queue size");
		Scanner sc=new Scanner(System.in);
		int Queue_size=sc.nextInt();
		int q[]=new int [Queue_size];
		do
		{
			System.out.println("1.INSERT");
			System.out.println("2.DELETE");
			System.out.println("3.DISPLAY");
			System.out.println("4.EXIT!");
			System.out.println("enetr your choice");
			choice=sc.nextInt();
			if(choice==1)
			{
				if(rear==Queue_size-1)
				{
					System.out.println("ueue overflow");
				}
				else
				{
					System.out.println("eneter element in ueue");
					item=sc.nextInt();
					q[++rear]=item;
				}
				
				
			}
			if(choice==2)
			{
				if(front>rear)
				{
					System.out.println("ueue underflow");
				}
				else
				{
					System.out.println(q[front++]);
				}
			}
			if(choice==3)
			{
				for(int i=front;i<=rear;i++)
				{
					System.out.println(q[i]);
				}
			}
			
		}while(choice!=4);
		
		
	}

}
