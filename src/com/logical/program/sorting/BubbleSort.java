package com.logical.program.sorting;

import java.util.Arrays;
//bubble sort
//compare adjacent element if adjacent next element is greater then swap
public class BubbleSort
{
	public static void main(String[] args)
	{
	int arr[]= {85,78,89,11,30};
	int temp;
	for(int i=arr.length-1;i>=0;i--)
	{                 
		for(int j=0;j<i;j++)
		{
			if(arr[j]>arr[j+1])
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
