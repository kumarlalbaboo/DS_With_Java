package com.logical.program.String;

public class FindLengthOfSringWithoutUsingLengthMethod
{
public static void main(String[] args) {
	String str="i love my india";
	int count = 0;
	for(char ch:str.toCharArray())
	{
		count++;
	}
	System.out.println("length of string without length method"+count);
	System.out.println("lenth of string with length methiod"+str.length());
	
}
}
