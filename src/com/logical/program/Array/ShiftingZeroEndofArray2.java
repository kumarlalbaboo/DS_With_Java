package com.logical.program.Array;

import java.util.Arrays;

public class ShiftingZeroEndofArray2 
{
	public static void main(String[] args)
	{
		//int arr[]= {0,1,4,0,5,0,7,9,4,0};
		int arr[]= {0,1,1,0,1,0,1,1,1,0};
		int j=0;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int val : arr) {
			System.out.print(val+" ");
		}
		
		
		
	}

}
