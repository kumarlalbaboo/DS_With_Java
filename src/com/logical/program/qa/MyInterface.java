package com.logical.program.qa;

public interface MyInterface
{
	default void printeven()
	{
		for(int i=0;i<10;i+=2)
		{
			System.out.print(i+" ");
		}
	}
	static void printodd()
	{
		for(int i=1;i<10;i+=2)
		{
			System.out.print(i+" ");
		}
	}
}
