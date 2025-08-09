package com.logical.program.Array;

import java.util.Arrays;

public class MobileDynm 
{
	public static void main(String[] args)
	{
		int input[]= {2,5,6,7,8,9,5};
		int MAX_LENGTH=10;
		int result[]=new int [MAX_LENGTH];
		int start_index=MAX_LENGTH-input.length;
		for(int i=0;i<input.length;i++)
		{
			result[start_index+i]=input[i];
			//result[i]=input[i];
		}
		System.out.println(Arrays.toString(result));
		
		
	}

}
