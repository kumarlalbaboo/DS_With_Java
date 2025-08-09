package com.logical.program.alphabetpattern;
/*
    A
   BA
  CBA
 DCBA
EDCBA

*/
public class Alphabet32 {
public static void main(String[] args)
{
	int i,j,sp=4;
	for(i=65;i<=69;i++)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j>=65;j--)
		{
			System.out.print((char)j);
		}
		sp--;
		System.out.println();
	}
	
	
}
}
