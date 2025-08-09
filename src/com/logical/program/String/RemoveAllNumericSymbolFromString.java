package com.logical.program.String;

public class RemoveAllNumericSymbolFromString 
{
	public static void main(String[] args) 
	{
		String str1="deepak123kumar456";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch>=48&ch<=57)
			{
				
			}
			else
			{
				str2=str2+ch;
			}
		}
		System.out.println(str2);
		
	}

}
