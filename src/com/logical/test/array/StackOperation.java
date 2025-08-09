package com.logical.test.array;

import java.util.Scanner;
//implement using ueue
public class StackOperation 
{
	public static void main(String[] args)
	{
		int top=-1,item,choice;
		System.out.println("please enter statck size");
		Scanner sc=new Scanner(System.in);
		int max_size=sc.nextInt();
		int st[]=new int[max_size]; 
		do
		{
			System.out.println("1.push opearation");
			System.out.println("2.pop opeartion");
			System.out.println("3.display operation");
			System.out.println("EXIT!");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			if(choice==1)
			{
				if(top==max_size-1)
				{
					System.out.println("stack overflow");
				}
				else
				{
					System.out.println("enter element that you want to push in stack");
					item=sc.nextInt();
					st[++top]=item;
					
				}
			}
			else if(choice==2)
			{
				if(top==-1)
				{
					System.out.println("stack underflow");
				}
				
				else
				{
					System.out.println(st[top--]);
				}
				
			}
			else if(choice==3)
			{
				for(int i=0;i<=top;i++)
				{
					System.out.println(st[i]);
				}
			}
		}while(choice!=4);
		
	}

}
