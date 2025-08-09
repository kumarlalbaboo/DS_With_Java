package com.logical.program.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindMissingElementInArrayBetween1TO100
{
	public static void main(String[] args) 
	{
		/*int arr[]= {23,67,89,43,56,10,31,1,2,3,4,5};
		int found;
		System.out.println("beolow are missing element in array");
		for(int i=1;i<=100;i++)
		{
			found=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					found++;
				}
				
			}
			if(found==0)
			{
				System.out.print(i+",");
			}
		}*/
		
		HashSet<Integer>inHashSet=new HashSet<Integer>();
		
		
		int arr[]= {1,2,5,8,9,10};
		for(int i=1;i<=10;i++)
		{
			inHashSet.add(i);
		}
		for(int num:arr)
		{
			inHashSet.remove(num);
		}
		System.out.println(inHashSet);
		
		
		
	}

}
