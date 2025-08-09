package com.logical.test.array;

import java.util.ArrayList;

public class CustomArrayListBehaveSet extends ArrayList
{
	public boolean add(Object ele)
	{
		if(this.contains(ele))
		{
			return true;
		}
		else
		{
			return super.add(ele);
		}
		
	}
	public static void main(String[] args) 
	{
		CustomArrayListBehaveSet set=new CustomArrayListBehaveSet();
		set.add(10);
		set.add(20);
		set.add(10);
		System.out.println(set);
		
	}

}
