package com.logical.program.alphabetpattern;
/*
0 
0 1 
0 1 1 
0 1 1 2 
0 1 1 2 3 
0 1 1 2 3 5 
0 1 1 2 3 5 8 
*/
public class Alphabet7 
{
	public static void main(String[] args) 
	{
		int i,j,a,b,c;
		for(i=1;i<=7;i++)
		{
			b=1;
			c=0;
			for(j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				a=b;
				b=c;
				c=a+b;
				
			}
			System.out.println();
		}	
	}

}
