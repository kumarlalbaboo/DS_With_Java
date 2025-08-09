package com.logical.program.alphabetpattern;
/*
ABCDEFEDCBA
ABCDE EDCBA
ABCD   DCBA
ABC     CBA
AB       BA
A         A
AB       BA
ABC     CBA
ABCD   DCBA
ABCDE EDCBA
ABCDEFEDCBA
*/

public class Alphabet39 {
public static void main(String[] args) {
	int i,j,sp=1,k=66;
	System.out.println("ABCDEFEDCBA");
	for(i=69;i>=65;i--)
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
		sp+=2;
		System.out.println();
	}
	sp=7;
	for(i=1;i<=4;i++)
	{
	for(j=65;j<=k;j++)
	{
		System.out.print((char)j);
	}
	for(j=1;j<=sp;j++)
	{
		System.out.print(" ");
	}
	for(j=k;j>=65;j--)
	{
		System.out.print((char)j);
	}
	sp-=2;
	System.out.println();
	k++;
	}
	System.out.println("ABCDEFEDCBA");
}
}
