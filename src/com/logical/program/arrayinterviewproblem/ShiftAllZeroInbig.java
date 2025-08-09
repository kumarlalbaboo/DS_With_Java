package com.logical.program.arrayinterviewproblem;

import java.util.Arrays;

public class ShiftAllZeroInbig 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,12,0,0,5,0,6,0};
		
		/*int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count]=1;
			count++;
		}
		
		System.out.println(Arrays.toString(arr));*/
		int temp;
		int j=0;
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
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
		
	}

}
