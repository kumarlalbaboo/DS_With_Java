package com.logical.program.Array;

public class PrintPrimeNumberBetween1to100
{
	public static void main(String[] args) 
	{
		int prime=0;
		for(int i=2;i<100;i++)
		{
			prime=0;
			for(int j=2;j<i;j++)
			{
				if((i%j)==0)
				{
					prime++;
				}
			}
			if(prime==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
