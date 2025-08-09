package com.logical.program.Array;

public class AddFirstAndLastNumberInArray
{
	public static void main(String[] args)
	{
		int arr[]= {12,3,4,6,8,9,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0||i==arr.length-1)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
	}

}
