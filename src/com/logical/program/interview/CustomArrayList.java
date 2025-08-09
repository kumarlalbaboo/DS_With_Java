package com.logical.program.interview;

import java.util.Arrays;

public class CustomArrayList<T>
{
	int size=0;
	
	Object []arr=new Object[10];
	
	public void add(T obj)
	{
		if(size==arr.length)
		{
			int new_capcity=(arr.length*2);
			arr=Arrays.copyOf(arr, new_capcity);
		}
		arr[size++]=obj;
	}
	public void printList() {
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) 
	{
		CustomArrayList custom=new CustomArrayList();
		custom.add(30);
		custom.add(40);
		custom.add(50);
		custom.add(30);
		custom.add(40);
		custom.add(50);
		custom.add(30);
		custom.add(40);
		custom.add(50);
		custom.add(30);
		custom.add(40);
		custom.add(50);
		custom.add("manish");
		custom.printList();
		
		
		
	}

}
