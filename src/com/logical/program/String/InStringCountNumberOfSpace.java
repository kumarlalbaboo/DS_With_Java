package com.logical.program.String;

public class InStringCountNumberOfSpace 
{
	public static void main(String[] args) 
	{
		String str="india is a big country";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("total number of spaces="+count);
		
	}

}
