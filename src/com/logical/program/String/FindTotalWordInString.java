package com.logical.program.String;

public class FindTotalWordInString 
{
	public static void main(String[] args) 
	{
		String str1="India   is a big   country  ";
		String[] words=str1.trim().split("\\s+");
		int count=0;
		for(String word:words)
		{
			count++;
		}
		System.out.println("Total Count of word"+count);
		
		
	}

}
