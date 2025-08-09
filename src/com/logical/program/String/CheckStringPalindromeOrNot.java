package com.logical.program.String;

public class CheckStringPalindromeOrNot
{
	public static void main(String[] args)
	{
		String str="malylam";
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
		{
			System.out.println("Both are Same");
		}
		else
		{
			System.out.println("Both Are Not Same");
		}
		
	}

}
