package com.logical.program.Array;

public class RecusionFactorial
{
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
public static void main(String[] args) 
{
	int result=RecusionFactorial.fact(8);
	System.out.println(result);
	
}
}
