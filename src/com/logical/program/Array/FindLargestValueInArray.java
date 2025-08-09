package com.logical.program.Array;

public class FindLargestValueInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {14,10,56,11,17};
		int lar=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>lar)
			{	
				lar=arr[i];
				}
				
				
			}
		
		System.out.println("largest value in array"+lar);
		
	}

}
