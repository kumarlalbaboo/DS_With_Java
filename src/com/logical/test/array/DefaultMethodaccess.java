package com.logical.test.array;

public class DefaultMethodaccess implements check
{
	public void runDefaultMethod()
	{
		check.super.message();
	}
	public static void main(String[] args)
	{
		//1 way
		check check1=new DefaultMethodaccess();
		check1.message();
		//2 way
		DefaultMethodaccess d1=new DefaultMethodaccess();
		d1.message();
		//3 way
		new DefaultMethodaccess().runDefaultMethod();
		
	}

}
