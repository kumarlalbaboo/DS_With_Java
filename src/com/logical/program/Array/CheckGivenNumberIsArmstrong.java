package com.logical.program.Array;

public class CheckGivenNumberIsArmstrong
{
	public static void main(String[] args)
	{
		int n=153;
		int temp=n;
		int arm=0;
		for(;n!=0;n=n/10)
		{
			arm=arm+(n%10)*(n%10)*(n%10);
		}
		if(temp==arm)
		{
			System.out.println("given number is armstrong");
		}
		else
		{
			System.out.println("given number is not armstrong");
		}
		
	}

}
