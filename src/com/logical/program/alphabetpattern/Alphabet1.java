package com.logical.program.alphabetpattern;
/*
A
AB
ABC
ABCD
ABCDE
*/
public class Alphabet1 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=65;i<=69;i++)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
