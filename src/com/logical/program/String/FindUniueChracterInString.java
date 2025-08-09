package com.logical.program.String;

public class FindUniueChracterInString 
{
	public static void main(String[] args) 
	{
		String str="All is well";
		int count;
		
		for(int i=65;i<=90;i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if(i==(int)ch||(i+32)==ch)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print((char)i+" ");
			}
		}
		
	}

}
