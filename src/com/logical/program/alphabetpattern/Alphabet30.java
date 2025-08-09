package com.logical.program.alphabetpattern;
/*
    1
   12
  123
 1234
12345

*/
public class Alphabet30 {
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
			System.out.print(j);
			
			
		
		}
		sp--;
		
		System.out.println();
	}
}
}
