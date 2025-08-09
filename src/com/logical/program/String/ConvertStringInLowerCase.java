package com.logical.program.String;

public class ConvertStringInLowerCase 
{
	public static void main(String[] args)
	{
		
		String str="DEEPAK";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				str2=str2+(char)(ch+32);
			}
		}
		System.out.print(str2);
		
	}

}
