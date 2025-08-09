package com.logical.program.String;

public class RemoveDuplicateCharcterFromString 
{
	public static void main(String[] args) 
	{
		String str="duplicateCharcter";
		int count=0;
		
		for(int i=97;i<122;i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if(i==(int)ch||(i-32)==(int)ch)
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
