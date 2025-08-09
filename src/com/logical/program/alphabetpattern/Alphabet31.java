package com.logical.program.alphabetpattern;
/*
D
DE
DEE
DEEP
DEEPA
DEEPAK
*/

public class Alphabet31
{
public static void main(String[] args) {
	int i,j;
	String str1="DEEPAK";
	for(i=0;i<str1.length();i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(str1.charAt(j));
		}
		System.out.println();
	}
}
}
