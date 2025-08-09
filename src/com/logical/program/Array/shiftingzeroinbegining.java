package com.logical.program.Array;

import java.util.Arrays;

public class shiftingzeroinbegining 
{
	public static void main(String[] args)
	{
		int arr[]= {1,0,0,1,1,0,1,0};
		int count=0;
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
		
		
	}

}
