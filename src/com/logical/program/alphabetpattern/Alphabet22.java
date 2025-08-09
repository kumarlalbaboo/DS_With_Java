package com.logical.program.alphabetpattern;
/*
    1
   22
  333
 4444
55555

*/

public class Alphabet22 {
public static void main(String[] args) {
	int i,j,sp=4;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		sp--;
		System.out.println();
	}
}
}
