package com.logical.program.alphabetpattern;
/*
ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE
*/

public class Alphabet40 {
public static void main(String[] args) {
	int i,j,k=66;
	for(i=69;i>=65;i--)
	{
		for(j=65;j<=i;j++)
		{
			System.out.print((char)j);
		}
		System.out.println();
	}
	for(i=1;i<=4;i++)
	{
		for(j=65;j<=k;j++)
		{
			System.out.print((char)j);
		}
		System.out.println();
		k++;
	}
}
}
