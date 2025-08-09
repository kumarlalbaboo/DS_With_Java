package com.logical.program.Array;

import java.util.Arrays;

public class ShiftAllZeroInBeginingandOneInLast 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,0,1,1,0,1,0};
		int temp,j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
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
