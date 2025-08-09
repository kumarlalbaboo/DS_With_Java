package com.logical.program.qa;

public class FindMissingElementInArray 
{
	public static void main(String[] args)
	{
		
		
		int arr[]= {1,2,5,4};
		int count;
		//1-5
		for(int i=1;i<5;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.print("missing element"+i+" ");
			}
		}
	}

}
