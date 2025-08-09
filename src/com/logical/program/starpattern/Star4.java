package com.logical.program.starpattern;

/*
 
*****
 ****
  ***
   **
    *
 
 */

public class Star4 {

	public static void main(String[] args)
	{
		int i,j,sp=0;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			sp++;
			System.out.println();
		}

	}

}
