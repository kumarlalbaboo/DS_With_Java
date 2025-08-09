package com.logical.program.alphabetpattern;
/*
ABCDE
ABCD
ABC
AB
A
*/


public class Alphabet2 
{
public static void main(String[] args) 
{
	int i,j,term=69;
	for(i=65;i<=69;i++)
	{
		for(j=65;j<=term;j++)
		{
			System.out.print((char)j);
		}
		term--;
		System.out.println();
		
	}
	
}
}
