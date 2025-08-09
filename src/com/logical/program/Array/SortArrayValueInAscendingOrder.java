package com.logical.program.Array;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SortArrayValueInAscendingOrder 
{
	public static void main(String[] args)
	{
		int arr[]= {13,2,16,8,25};
		IntStream.of(arr).boxed().sorted().forEach(e->System.out.print(e+" "));
		int temp;
		for(int i=0;i<arr.length-1;i++)
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
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+"  ");
		}
		
		
	}

}
