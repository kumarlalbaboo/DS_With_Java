package com.logical.program.qa;

public class DefaultMethodAccess implements MyInterface
{
	public void callDefaultMethod()
	{
		MyInterface.super.printeven();
	}
	public static void main(String[] args) 
	{
		//1way
		new DefaultMethodAccess().callDefaultMethod();
		//2way
		DefaultMethodAccess df=new DefaultMethodAccess();
		df.printeven();
		
		//3 way
		MyInterface myInterface=new DefaultMethodAccess();
		myInterface.printeven();
		
	}
	
}
