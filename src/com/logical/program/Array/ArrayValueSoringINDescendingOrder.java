package com.logical.program.Array;

public class ArrayValueSoringINDescendingOrder 
{
	public static void main(String[] args)
	{
		int arr[]= {34,55,66,12,10};
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
	}

}
