package com.logical.program.qa;
import java.util.Arrays;

public class Printallzeroatend1
{
	public static void main(String[] args) {
		int arr[]= {3,4,0,0,8,2,0,7,0,6};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
			
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
