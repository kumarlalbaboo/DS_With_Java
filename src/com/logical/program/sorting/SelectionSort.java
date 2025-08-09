package com.logical.program.sorting;

//selection sort in which pick one element compare with all element if element is greater then swap
import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {34,12,78,56,21};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
