package com.logical.program.String;

public class RemoveSpecialSymbolFromString 
{
public static void main(String[] args)
{
	String str1="deepak@gmail#com?ok";
	String str2="";
	
	for(int i=0;i<str1.length();i++)
	{
		char ch=str1.charAt(i);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)||(ch==32))
		{
			str2=str2+ch;
		}
		
	}
	System.out.println(str2);
	
}
}
