package com.logical.program.Array;

import java.util.Scanner;

public class BinarySearchUsingRecursion
{
	public static int binarySearch(int arr[],int low ,int high,int key)
	{
		if(low>high)
		{
		return -1;
		}
		int mid=(low+high)/2;
		if(key==arr[mid])
		{
			return mid;
		}
		else if(key<arr[mid])
		{
			return  binarySearch(arr, 0, mid-1, key);
		}
		else
		{
			return binarySearch(arr, mid+1, high, key);
		}
		
	}
	
	public static void main(String[] args)
	{
		int arr[]= {2,4,5,6,7,8,9};
		int key,low=0,high=arr.length-1;
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		int result=BinarySearchUsingRecursion.binarySearch(arr, low, high, key);
		System.out.println("element found at pos"+result);
		
		
	}

}
