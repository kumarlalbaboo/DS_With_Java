package com.logical.program.String;

public class RemoveVowelFromString 
{
	public static void main(String[] args) 
	{
		String str="Deepak";
		String str2="";
		
		for(int i=0;i<str.toLowerCase().length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
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
