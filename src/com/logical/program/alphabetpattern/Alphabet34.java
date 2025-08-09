package com.logical.program.alphabetpattern;
/*
RANJEET	
RANJEET	deepak	
RANJEET	deepak	ashis	
RANJEET	deepak	ashis	laddu	
RANJEET	deepak	ashis	laddu	piush	
RANJEET	deepak	ashis	laddu	piush	abigyan	

*/
public class Alphabet34 {
public static void main(String[] args) {
	int i,j;
	String name[]={"RANJEET","deepak","ashis","laddu","piush","abigyan"};
	for(i=0;i<name.length;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(name[j]+"\t");
		}
		System.out.println();
	}
	
}
}
