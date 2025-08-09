package com.logical.program.String;

public class InputABCDoutputBCDE
{
	public static void main(String[] args)
	{
		String str="ABCD";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.print((char)(ch+1));
		}
		
	}

}
