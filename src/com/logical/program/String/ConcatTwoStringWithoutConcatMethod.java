package com.logical.program.String;

public class ConcatTwoStringWithoutConcatMethod 
{
	public static void main(String[] args) 
	{
		String str1="akash";
		String str2="deep";
		String result="";
		for(int i=0;i<str2.length();i++)
		{
			str1=str1+str2.charAt(i);
		}
		System.out.println(str1);
	}

}
