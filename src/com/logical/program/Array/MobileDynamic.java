package com.logical.program.Array;

import java.util.Arrays;

public class MobileDynamic
{
	public static int[] mobileOp(int input[],int result[])
	{
		int start_index=result.length-input.length;
		for(int i=0;i<input.length;i++)
		{
			result[start_index+i]=input[i];
			//result[i]=input[i];
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
	int input[]= {1,3,4,5,6,7};
	int mobnum=10;
	int result[]=new int[mobnum];
	int res[]=mobileOp(input, result);
	System.out.println(Arrays.toString(res));
	
	
	}

}
