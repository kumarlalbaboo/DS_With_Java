package com.logical.program.alphabetpattern;
/*
   5
  54
 543
5432
*/
public class Alphabet9
{
	public static void main(String[] args) 
	{
		int i,j,sp=4,k=1;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(i=5,j=1;j<=k;j++,i--)
			{
				System.out.print(i);
				
				
			
			}
			k++;
			sp--;
			
			System.out.println();
	}
		
	}

}
