package com.logical.program.alphabetpattern;
/*
1
00
111
0000
11111
*/
public class Alphabet15
{
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}
		
	}

}
