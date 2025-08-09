package com.logical.program.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CustomImmutableClass 
{
	public static void main(String[] args) 
	{
		List<String>mobiles=new ArrayList<String>();
		mobiles.add("mob1");
		mobiles.add("mob2");
		mobiles.add("mob3");
		mobiles.add("mob4");
		Employee emp=new Employee("deepak", new Date(),mobiles,new Address(1, 200));
		emp.getDoj().setDate(18);
		System.out.println(emp);
		emp.getMobile().add("deepak");
		System.out.println(emp);
		emp.getAddress().setZip(400);
	}


}
