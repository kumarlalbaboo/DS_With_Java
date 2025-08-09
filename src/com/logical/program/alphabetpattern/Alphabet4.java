package com.logical.program.alphabetpattern;
/*
    A
   AB
  ABC
 ABCD
ABCDE

*/

public class Alphabet4 
{
public static void main(String[] args) {
	int i,j,sp=4;
	for(i=65;i<=69;i++)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=65;j<=i;j++)
		{
			System.out.print((char)j);
		}
		sp--;
		System.out.println();
	}
}
}
