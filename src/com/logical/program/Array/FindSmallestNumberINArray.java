package com.logical.program.Array;

public class FindSmallestNumberINArray 
{
	public static void main(String[] args) {
		
	
	int arr[]= {12,3,15,7,88};
	int small=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	System.out.println("small number="+small);
	}

}
