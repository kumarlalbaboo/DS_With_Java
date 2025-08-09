package com.logical.program.starpattern;

/*
 
    *
   ***
  *****
 *******
*********
 
 */

public class Star5 
{
	public static void main(String[] args)
	{
		int i,j,sp=4,star=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star+=2;
			sp--;
			System.out.println();
		}
		
	}

}
