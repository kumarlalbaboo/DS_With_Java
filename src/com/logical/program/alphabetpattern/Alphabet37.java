package com.logical.program.alphabetpattern;
/*
1
23
456
78910
1112131415

*/
public class Alphabet37 {
public static void main(String[] args) {
	int i,j,k=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(k);
			k++;
		}
		System.out.println();
	}
	
}
}
