package com.logical.program.Array;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,5,7,9,11};
		int low=0,high=arr.length-1,key,mid,found=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key");
		key=sc.nextInt();
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("element found at"+(mid+1));
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
			System.out.println("element not found");
		}
		
	}

}
