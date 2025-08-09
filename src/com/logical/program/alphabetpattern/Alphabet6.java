package com.logical.program.alphabetpattern;

import java.util.Scanner;
/*
enter any string
deepak

d
de
dee
deep
deepa
deepak
*/


public class Alphabet6
{
	public static void main(String[] args) 
	{
		int i,j;
		String str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		str1=sc.nextLine();
		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.println();
		}
			
	}

}
