package com.logical.program.Array;

import java.util.Arrays;

public class ShiftAllNonZeroInBegining
{
	public static void main(String[] args) {
		
	int arr[]= {5,1,8,11,1,12,1};
	int temp,j=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==1)
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
		}
	}
	System.out.println(Arrays.toString(arr));
	}
}
