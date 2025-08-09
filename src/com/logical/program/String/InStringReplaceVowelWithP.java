package com.logical.program.String;

public class InStringReplaceVowelWithP 
{
	public static void main(String[] args) 
	{
		String str1="i love india";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				str2=str2+'P';
			}
			else
			{
				str2=str2+ch;
			}
		}
		System.out.println(str2);
		
	}

}
