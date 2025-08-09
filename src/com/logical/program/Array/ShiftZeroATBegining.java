package com.logical.program.Array;

import java.util.Arrays;

public class ShiftZeroATBegining 
{
	public static void main(String[] args) 
	{              
		int arr[]= {0,5,8,0,0,9};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[count]=0;
				count++;
			}
		}
		
		
		while(count<arr.length)
		{
			arr[count]=1;
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//ouput 0,0,0,5,8,9 what changes need in exist code

}
