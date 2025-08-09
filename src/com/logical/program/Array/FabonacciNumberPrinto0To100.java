package com.logical.program.Array;

public class FabonacciNumberPrinto0To100
{
	public static void main(String[] args)
	{
		int i,a,b,c;
		for(i=0,b=1,c=0;c<100;c=a+b,i++)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
