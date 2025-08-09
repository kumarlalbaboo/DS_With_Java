package com.logical.program.String;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

//to find each charcater occurence in string
public class FindEachCharacterOccurencesInStrin
{
	public static void main(String[] args) 
	{
		int i,j,cnt;
		String str1="deepakumar";
		for(i=65;i<=90;i++)
		{
			cnt=0;
			for(j=0;j<str1.length();j++)
			{
				char ch=str1.charAt(j);
				if((i==(int)ch)||((i+32)==(int)ch))
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
			System.out.println((char)i+"comes"+cnt+"times");
			}
		}
		
	} 
	

}
