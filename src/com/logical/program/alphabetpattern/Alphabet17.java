package com.logical.program.alphabetpattern;
/*
10101
0101
010
10
1
*/
public class Alphabet17 {
public static void main(String[] args)
{
	int i,j,s=5,k=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=s;j++)
		{
			System.out.print(k%2);
			k++;
		}
		s--;
		System.out.println();
	}	
}
}
