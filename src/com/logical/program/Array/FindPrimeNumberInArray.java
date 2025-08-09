package com.logical.program.Array;

public class FindPrimeNumberInArray 
{
	public static void main(String[] args)
	{
		int arr[]= {3,6,7,10,11,14,17,80};
		int prime = 0;
		int j;
		for(int i=0;i<arr.length;i++)
		{
			prime=0;
			for(j=2;j<arr[i]&prime!=1;j++)
			{
				if(arr[i]%j==0)
				{
					prime++;
				}
			}
			if(prime==0)
			{
				System.out.print(arr[i]+",");
			}
		}
		
	}

}
