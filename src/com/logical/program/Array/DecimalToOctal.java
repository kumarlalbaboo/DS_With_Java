package com.logical.program.Array;

public class DecimalToOctal
{
	public static void main(String[] args)
	{
	int n=24;
	String str="";
	while(n!=0)
	{
		str=(n%8)+str;
		n=n/8;
	}
	System.out.println("octal conversion"+str);
	}

}
