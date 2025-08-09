package com.logical.program.searching;

import java.util.Scanner;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int arr[]= {12,17,18,19,23,24,44,55,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter element that you want to search");
		int element=sc.nextInt();
		int i,found=0;
		for(i=0;i<arr.length&&found!=1;i++)
		{
			if(arr[i]==element)
			{
				found++;
				
			}
				
		}
		if(found>0)
		{
			System.out.println("element foundat position"+(i+1));
		}
		else
		{
			System.out.println("element not found");
		}
		
	}

}
