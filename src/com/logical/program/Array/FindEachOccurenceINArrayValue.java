package com.logical.program.Array;

public class FindEachOccurenceINArrayValue 
{
	public static void main(String[] args) 
	{
		int arr[]= {14,17,3,12,3,3,3,11,11,5,7,80,88};
		int found;
		int sum=0;
		
		/*for(int i=0;i<arr.length-1;i++)
		{
			found=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					found++;
				}
			}
			if(found>0)
			{
			System.out.println(arr[i]+"found"+found+"times");
			}
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		for(int i=0;i<=sum;i++)
		{
			found=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					found++;
				}
			}
			if(found>0)
			{
				System.out.println(i+"comes"+found+"times");
			}
		}
		
		
		
	}

}
