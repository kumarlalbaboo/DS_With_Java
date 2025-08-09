package com.logical.program.alphabetpattern;
/*
1
01
010
1010
10101
*/

public class Alphabet14 {
public static void main(String[] args) {
	int i,j,k=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(k%2);
			k++;
		}
		System.out.println();
	}
	
}
}
