package com.logical.program.Array;

import java.util.Scanner;

public class FindFactorial 
{
	public static void main(String[] args)
	{
		int n,fact=1;
		System.out.println("enter number for that want to calculate factorial");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number: "+fact);
		
	}

}
