package com.logical.program.Array;

public class CountTotalNumberOfDigitInNumber 
{
	public static void main(String[] args) 
	{
		int n=13456;
		int digit=0;
		for(;n!=0;n=n/10)
		{
			digit++;
		}
		System.out.println("total nuber od digit"+digit);
		
	}

}
