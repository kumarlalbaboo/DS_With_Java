package com.logical.program.Array;

public class FindSecondSmallestNumberInArray
{
	public static void main(String[] args) {
		
		
		int arr[]= {12,3,15,7,88};
		int small=arr[0];
		int count=0;
		for(int i=1;i<arr.length&&count!=2;i++)
		{
			
			if(arr[i]<small)
			{
				count++;
				if(count==2)
				{
				small=arr[i];
				}
			}
		}
		System.out.println("small number="+small);
		}


}
