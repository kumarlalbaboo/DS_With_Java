package com.logical.program.alphabetpattern;
/*
55555
 4444
  333
   22
    1
*/

public class Alphabet21 {
public static void main(String[] args) {
	int i,j,sp=0,k=5;
	for(i=5;i>=1;i--)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=k;j++)
		{
			System.out.print(i);
		}
		k--;
		sp++;
		System.out.println();
	}
	
}
}
