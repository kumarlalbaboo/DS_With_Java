package com.logical.program.starpattern;

/*
123454321
 2345432
  34543
   454
    5
   454
  34543
 2345432
123454321
*/


public class Star9
{
public static void main(String[] args)
{
	int i,j,sp=0;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j<=5;j++)
		{
			System.out.print(j);
		}
		for(j=4;j>=i;j--)
		{
			System.out.print(j);
		}
		sp++;
		System.out.println();
	}
	sp=3;
	for(i=4;i>=1;i--)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j<=5;j++)
		{
			System.out.print(j);
		}
		for(j=4;j>=i;j--)
		{
			System.out.print(j);
		}
		sp--;
		System.out.println();
	}	
}
}
