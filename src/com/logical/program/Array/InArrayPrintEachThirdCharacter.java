package com.logical.program.Array;

public class InArrayPrintEachThirdCharacter 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=2;i<arr.length;i+=3)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
