package com.logical.program.interview;

import java.util.HashSet;

public class MyCustomSetInterface extends HashSet
{
	
	public boolean add(Object ele)
	{
		if(this.contains(ele))
		{
			return true;
		}
		else
			return super.add(ele);	
	}
	public static void main(String[] args) {
		MyCustomSetInterface mn=new MyCustomSetInterface();
		mn.add(1);
		mn.add(1);
		mn.add(1);
		mn.add(2);
		System.out.println(mn);
	}

}
