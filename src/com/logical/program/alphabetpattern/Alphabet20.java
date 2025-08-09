package com.logical.program.alphabetpattern;
/*
55555
4444
333
22
1
*/
public class Alphabet20 {
public static void main(String[] args) {
	int i,j,k=5;
	for(i=5;i>=1;i--)
	{
		for(j=1;j<=k;j++)
		{
			System.out.print(i);
		}
		k--;
		System.out.println();
	}
}
}
