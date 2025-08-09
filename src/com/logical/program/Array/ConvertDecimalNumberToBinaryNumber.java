package com.logical.program.Array;

public class ConvertDecimalNumberToBinaryNumber
{
	public static void main(String[] args)
	{
		int n=10;
		String str="";
		while(n!=0)
		{
			str=(n%2)+str;
			n=n/2;
		}
		System.out.println("binary Conversion "+str);
		
	}

}
