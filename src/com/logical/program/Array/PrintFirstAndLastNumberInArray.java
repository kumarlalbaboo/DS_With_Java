package com.logical.program.Array;

public class PrintFirstAndLastNumberInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,3,4,17,8,90};
		for(int i=0;i<arr.length;i++)
		{
			if(i==0||i==arr.length-1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
