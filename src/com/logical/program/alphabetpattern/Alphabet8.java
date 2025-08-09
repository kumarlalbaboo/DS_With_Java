package com.logical.program.alphabetpattern;
/*
54321
5432
543
54
5
*/

public class Alphabet8
{
	public static void main(String[] args)
	{
		int i,j,k=1;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=k;j--)
			{
				System.out.print(j);
			}
			k++;
			System.out.println();
		}
		
		
	}

}
