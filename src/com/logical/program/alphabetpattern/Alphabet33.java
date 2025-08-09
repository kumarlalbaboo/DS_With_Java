package com.logical.program.alphabetpattern;
/*
A         A
AB       BA
ABC     CBA
ABCD   DCBA
ABCDE EDCBA
ABCDEFEDCBA

*/

public class Alphabet33 {
public static void main(String[] args) {
	int i,j,sp=9;
	for(i=65;i<=69;i++)
	{
		for(j=65;j<=i;j++)
		{
			System.out.print((char)j);
		}
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j>=65;j--)
		{
			System.out.print((char)j);
		}
		sp-=2;
		System.out.println();
	}
	System.out.print("ABCDEFEDCBA");
}
}
