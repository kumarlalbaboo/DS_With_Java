package com.logical.program.Array;

import java.util.Scanner;

public class PrintFabonacciNumberBasedOnuserInput
{
public static void main(String[] args) {
	System.out.println("enter number up to that want to print fabonacci number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i,a,b,c;
	
	for(i=0,b=1,c=0;i<num;i++,c=a+b)
	{
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	
	
	
}
}
