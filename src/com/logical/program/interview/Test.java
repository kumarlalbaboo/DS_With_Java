package com.logical.program.interview;

public class Test 
{
	public void getOrder(int id) throws CustomException
	{
		if(id==101)
		{
			throw new CustomException("order not found");
		}
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
		try {
			t1.getOrder(101);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
