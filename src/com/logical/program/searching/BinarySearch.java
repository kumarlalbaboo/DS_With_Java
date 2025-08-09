package com.logical.program.searching;

import java.util.Scanner;


public class BinarySearch
{
	public static void main(String[] args) 
	{
        int i,key,n,low,high,found=0,mid;
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the number of elemnt in array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"number in array\n");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		//int arr[]= {12,45,67,23,14,17,18,78};
		low=0;int[] arr = {2, 4, 5, 6, 7, 9, 15, 88,89};
		high=arr.length-1;
		System.out.println("enter key element that u want to searched");
		key=sc.nextInt();
		while(low<=high)
		{
		    mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println(key+"element found at location"+(mid+1));
				found++;
				break;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
		}
		if(found==0)
		{
			System.out.println("element not found in array");
		}
	}
	}
