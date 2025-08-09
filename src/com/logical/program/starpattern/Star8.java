package com.logical.program.starpattern;
/*
12345654321
 234565432
  3456543
   45654
    565
     6
    565
   45654
  3456543
 234565432
12345654321
*/


public class Star8 
{
	public static void main(String[] args) {
		
	
	int i,j,sp=0;
	for(i=1;i<=6;i++)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j<=6;j++)
		{
			System.out.print(j);
		}
		for(j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		sp++;
		System.out.println();
	}
	sp=4;
	for(i=5;i>=1;i--)
	{
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j<=6;j++)
		{
			System.out.print(j);
		}
		for(j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		sp--;
		System.out.println();
		
	}
	}

}
