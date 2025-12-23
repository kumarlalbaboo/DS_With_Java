package com.logical.program.String;

public class RemoveAllNumericSymbolFromString 
{
	public static void main(String[] args) 
	{
		String str1="deepak123kumar456";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);

			if(!Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
		
	}

}
