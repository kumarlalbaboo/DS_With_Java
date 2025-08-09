package com.logical.program.String;

public class ReverseStringNamesOnSamePlaces 
{
	public static void main(String[] args) 
	{
	String names[]= {"deepak","manjit","java","DBMS","AKASH"};
	
	for(int i=0;i<names.length;i++)
	{
		for(int j=names[i].length()-1;j>=0;j--)
		{
			System.out.print(names[i].charAt(j));
		}
		System.out.print(" ");
	}
	
	}

}
