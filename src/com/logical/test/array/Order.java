package com.logical.test.array;

public class Order 
{
	public static void main(String[] args) throws OrderNotFoundException
	{
		int orderid=101;
		if(orderid==101)
		{
			throw new OrderNotFoundException("orderid not available");
		}
		
	}

}
