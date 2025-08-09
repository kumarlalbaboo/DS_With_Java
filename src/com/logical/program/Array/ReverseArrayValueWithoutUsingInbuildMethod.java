package com.logical.program.Array;

public class ReverseArrayValueWithoutUsingInbuildMethod 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,14,16,9,90};
		System.out.print("array value display in reverse order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
