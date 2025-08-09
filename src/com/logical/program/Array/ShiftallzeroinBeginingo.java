package com.logical.program.Array;

import java.util.Arrays;

public class ShiftallzeroinBeginingo 
{
	public static void main(String[] args) 
	{
		int input[]= {1,0,0,1,1,1,1,0,1};
		int temp,j=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=0)
			{
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				j++;
				
			}
		}
		System.out.println(Arrays.toString(input));
		
		
	}

}
