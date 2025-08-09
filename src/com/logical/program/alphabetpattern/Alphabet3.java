package com.logical.program.alphabetpattern;
/*
A
BB
CCC
DDDD
EEEEE
*/

public class Alphabet3
{
public static void main(String[] args) 
{
	int i,j;
	for(i=65;i<=69;i++)
	{
		for(j=65;j<=i;j++)
		{
			System.out.print((char)i);
		}
		System.out.println();
	}
}
}
