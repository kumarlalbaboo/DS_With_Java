package com.logical.program.Array;

public class PrimeNumberBetwwen1to100Display
{
	public static void main(String[] args)
	{
		int prime;
		for(int i=2;i<100;i++)
		{
			prime=0;
			for(int j=2;j<i&&prime!=1;j++)
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
