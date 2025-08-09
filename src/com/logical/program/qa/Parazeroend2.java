package com.logical.program.qa;
import java.util.Arrays;

public class Parazeroend2
{
	public static void main(String[] args) {
		int arr[]= {45,0,66,0,55,34,0,23};
		int temp,j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
