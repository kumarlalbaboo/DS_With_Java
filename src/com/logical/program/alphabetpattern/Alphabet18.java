package com.logical.program.alphabetpattern;
/*
00000
11111
00000
11111
00000
*/
public class Alphabet18 {
public static void main(String[] args)
{
	
	int i,j;
	for(i=2;i<=6;i++)
	{
		for(j=2;j<=6;j++)
		{
			System.out.print(i%2);
		}
		System.out.println();
	}
}
}
