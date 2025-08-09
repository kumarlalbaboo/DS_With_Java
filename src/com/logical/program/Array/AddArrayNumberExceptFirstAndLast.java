package com.logical.program.Array;

public class AddArrayNumberExceptFirstAndLast
{
	public static void main(String[] args)
	{
		int arr[]= {12,2,3,4,5,7,1};
		int sum=0;
		for(int i=1;i<arr.length-1;i++)
		{
			
			sum=sum+arr[i];
		}
		System.out.println("sum"+sum);
		
	}

}
