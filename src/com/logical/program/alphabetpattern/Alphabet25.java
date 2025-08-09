package com.logical.program.alphabetpattern;
/*
11111
1111
111
11
1
*/
public class Alphabet25 {
public static void main(String[] args) {
	int i,j,k=1,term=5;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=term;j++)
		{
			System.out.print(k);
		}
		term--;
		System.out.println();
	}
}
}
