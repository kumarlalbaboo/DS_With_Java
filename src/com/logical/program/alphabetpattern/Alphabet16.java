package com.logical.program.alphabetpattern;
/*
10101
 1010
  101
   10
    1
 */


public class Alphabet16 
{
	public static void main(String[] args)
	{
		int i,j,sp=0;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j%2);
				
			}
			sp++;
			System.out.println();
		}
		
	}

}
