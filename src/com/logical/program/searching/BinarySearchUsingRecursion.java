package com.logical.program.searching;

import java.util.Scanner;

public class BinarySearchUsingRecursion 
{
	
	public static  int BinarySearchUsingRecursion(int arr[],int low,int high,int key)
	{
		if(low>high)
		{
			return 0;
		}
		int mid = (low + high) / 2;
		
			if(arr[mid]==key)
			{
				return mid ;
			}
			else if(key<arr[mid])
			{
				return BinarySearchUsingRecursion(arr, low, mid-1, key);
			}
			else
			{
				return BinarySearchUsingRecursion(arr, mid+1, high, key);
			}
		}
		
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//int[] arr = {2, 4, 5, 6, 7, 9,65,34,21};
		int[] arr = {2, 4, 5, 6, 7, 9, 15, 88,89};
		
		System.out.println("enter key");
		int key=sc.nextInt();
		int result=BinarySearchUsingRecursion(arr,0,arr.length-1,key);
		if(result!=0)
		{
			System.out.println("found at"+(result+1));
		}
		else
		{
			System.out.println("result not found");
		}
		
	}

}
