package com.logical.program.Array;

public class ShiftingZeroEndOfArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {0,1,3,4,0,5,0,9,8};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			arr[count]=arr[i];
			count++;
			}
		}
		while (count<arr.length) 
		{
			arr[count]=0;
			count++;	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
