package com.logical.program.starpattern;

/*

*********
 *******
  *****
   ***
    *
  
  */

public class Star6 
{
	public static void main(String[] args)
	{
		int i,j,star=9,sp=0;
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
			sp++;
			star-=2;
			System.out.println();
		}
		
	}

}
