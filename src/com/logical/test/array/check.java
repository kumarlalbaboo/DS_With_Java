package com.logical.test.array;

public interface check 
{
	default void message()
	{
		System.out.println("from message");
	}
	static void getStaticConnection()
	{
		System.out.println("connection propeties");
	}

}
