package com.logical.program.String;

public class StringConvertInUpperCase 
{
	public static void main(String[] args) 
	{
		String str1="deepak";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				System.out.print((char)(ch-32));
			}
			else
			{
				System.out.print(ch);
			}
		}
		
		
	}

}
