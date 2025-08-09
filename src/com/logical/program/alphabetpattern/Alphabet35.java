package com.logical.program.alphabetpattern;
/*
0
01
011
0112
01123
011235
0112358

*/

public class Alphabet35 {
public static void main(String[] args) 
{
	int i,j,a,b,c;
	for(i=1;i<=7;i++)
	{
		b=1;
		c=0;
		for(j=1;j<=i;j++)
		{
			System.out.print(c);
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println();
	}
	
}
}
