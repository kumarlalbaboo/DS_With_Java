package com.logical.program.interview;

import java.util.Arrays;

public class MyCustomArrayList
{
	private Object []arr;
	int size;
	private static final int DEFAULT_SIZE=10; 
	
	public MyCustomArrayList()
	{
		arr=new Object[DEFAULT_SIZE];
		size=0;
	}
	
	public void add(Object element)
	{
		if(size==arr.length)
		{
			arr=Arrays.copyOf(arr, (arr.length)*2);
		}
		arr[size++]=element;
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		MyCustomArrayList list=new MyCustomArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("akash");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("akash");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("akash");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("akash");
		list.display();
		
	}

}
