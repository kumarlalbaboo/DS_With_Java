package com.logical.program.alphabetpattern;
/*
12345
1234
123
12
*/


public class Alphabet10 
{
	public static void main(String[] args)
	{
		int i,j,k=5;
		for(i=1;i<5;i++)
		{
			for(j=1;j<=k;j++)
			{
				System.out.print(j);
			}
			k--;
			System.out.println();
		}

		
	}

}
