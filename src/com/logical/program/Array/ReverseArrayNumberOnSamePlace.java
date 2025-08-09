package com.logical.program.Array;

public class ReverseArrayNumberOnSamePlace 
{
	public static void main(String[] args)
	{
		int arr[]= {12,34,53,67,89};
		int rev=0;
		int n;
		for(int i=0;i<arr.length;i++)
		{
			rev=0;
			n=arr[i];
			for(;n!=0;n=n/10)
			{
				rev=(rev*10)+n%10;
			}
			System.out.print(rev+" ");
		}
		
		
		
	}

}
