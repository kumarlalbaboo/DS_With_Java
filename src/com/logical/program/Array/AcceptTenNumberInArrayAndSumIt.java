package com.logical.program.Array;

import java.util.Scanner;

public class AcceptTenNumberInArrayAndSumIt
{
	public static void main(String[] args)
	{
		int arr[]=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter ten number");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sumof array number="+sum);
		
	}

}
