package com.logical.program.Array;

public class CheckNumberIsPrimeOrNot 
{
	public static void main(String[] args) 
	{
		int n=37;
		int prime=0;
		for(int i=2;i<n&&prime!=1;i++)
		{
			if(n%2==0)
			{
				prime++;
			}
		}
		if(prime==0)
		{
			System.out.println("given number is prime number");
		}
		else
		{
			System.out.println("given number is not prime number");
		}
		
	}

}
