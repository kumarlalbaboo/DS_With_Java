package com.logical.program.Array;

import java.util.Scanner;

public class FindFactorialOfNumberUsingRecursion 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter any number");
		int n=sc.nextInt();
		int result=fact(n);
		System.out.println(result);
		
	}
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
		return n*fact(n-1);
		}
		
	}

}
