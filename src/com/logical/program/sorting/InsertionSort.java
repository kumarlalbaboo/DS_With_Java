package com.logical.program.sorting;

import java.util.Arrays;

//insertion sort
//compare value if next element is greater then swap and comapre prev
//elemnt from current elemnt

public class InsertionSort
{
public static void main(String[] args) 
{
	int arr[]= {15,27,66,43,90};
	int temp;
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j>0;j--)
		{
			if(arr[j]<arr[j-1])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
	}
	System.out.println(Arrays.toString(arr));
	
	
}
}
