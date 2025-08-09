package com.logical.program.ask;

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
	public void add(Object ele)
	{
		if(size==arr.length)
		{
			arr=Arrays.copyOf(arr, (arr.length)*2);
		}
		arr[size++]=ele;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		MyCustomArrayList al=new MyCustomArrayList();
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.add(13);
		al.add("deepak");
		al.display();
	}

}
