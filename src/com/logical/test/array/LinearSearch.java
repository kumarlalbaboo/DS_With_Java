package com.logical.test.array;

public class LinearSearch
{
	public static void main(String[] args) 
	{
		int arr[]= {34,67,89,33,21,55,33};
		int key=89,found=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("element found at position->"+(i+1));
				found++;
			}
		}
		if(found==0)
		{
			System.out.println("element not found");
		}
		
	}

}
