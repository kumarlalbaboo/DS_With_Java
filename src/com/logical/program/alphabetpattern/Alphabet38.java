package com.logical.program.alphabetpattern;
/*
A
BC
DEF
GHIJ
KLMNO
*/
public class Alphabet38 {
public static void main(String[] args) 
{
	int i,j,k=65;
	for(i=65;i<=69;i++)
	{
		for(j=65;j<=i;j++)
		{
			//System.out.print((char)k);
			System.out.print((char)k);
			k++;
		}
		System.out.println();
	}
}
}
