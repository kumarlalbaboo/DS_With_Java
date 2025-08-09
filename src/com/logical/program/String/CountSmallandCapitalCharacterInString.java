package com.logical.program.String;

public class CountSmallandCapitalCharacterInString 
{
	public static void main(String[] args)
	{
		String str1="RohitSharMa";
		int small_count=0;
		int big_count=0;
			for(int j=0;j<str1.length();j++)
			{
				char ch=str1.charAt(j);
				if((int)ch>=65&&(int)ch<=90)
				{
				big_count++;	
				}
				else
				{
					small_count++;
				}

		}
			
			System.out.println("smallcount"+small_count);
			System.out.println("bigcount"+big_count);
	}

}
