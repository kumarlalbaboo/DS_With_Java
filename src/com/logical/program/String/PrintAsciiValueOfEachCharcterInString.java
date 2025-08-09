package com.logical.program.String;

public class PrintAsciiValueOfEachCharcterInString 
{
	public static void main(String[] args)
	{
		String str="deepAK";
		for(int i=0;i<str.length();i++)
		{
			System.out.print((int)str.charAt(i)+" ");
		}
		
	}

}
