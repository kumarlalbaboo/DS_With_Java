package com.logical.program.basic;

/*String input ="TodayIsTuesday8thApril2025";
5202821*/
/*input = "aabbccddd" 
output = a2b2c2d3*/

public class A 
{
public static void main(String[] args)
{
	String input ="TodayIsTuesday8thApril2025";
	int count=0;
	String str2="";
	String str3="";

	/*for(int i=0;i<input.length();i++)
	{
		
		char ch=input.charAt(i) ;
		if(ch>=48&&ch<=57)
		{
			str2=str2+ch;
			//System.out.println(str2);
		}
		else
		{
			count++;
		}
	}
	
	for(int i=str2.length()-1;i>=0;i--)
	{
		str3=str3+str2.charAt(i);
	}
	System.out.println(str3+count);*/
	
	for(int i=input.length()-1;i>=0;i--)
	{
		
		char ch=input.charAt(i) ;
		if(ch>=48&&ch<=57)
		{
			str2=str2+ch;
			
		}
		else
		{
			count++;
		}
	}
	
	
	System.out.println(str2+count);
	
}
}
