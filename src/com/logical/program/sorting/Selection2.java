package com.logical.program.sorting;

import java.util.Arrays;

public class Selection2 
{
public static void main(String[] args) 
{
int temp;
int arr[]= {23,67,85,43,29};
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
