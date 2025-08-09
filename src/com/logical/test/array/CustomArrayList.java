package com.logical.test.array;

import java.util.Arrays;

public class CustomArrayList
{
	private static final int MAX_SIZE=10;
	private Object[]arr=new Object[MAX_SIZE];
	int size=0;
	
	public void add(Object ele)
	{
		if(size==MAX_SIZE-1)
		{
			arr=Arrays.copyOf(arr, (arr.length)*2);
		}
		arr[size++]=ele;
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		CustomArrayList custom=new CustomArrayList();
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.add(10);
		custom.add("safe");
		custom.display();
		
	}

}
