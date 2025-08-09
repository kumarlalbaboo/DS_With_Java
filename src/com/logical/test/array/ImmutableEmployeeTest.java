package com.logical.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ImmutableEmployeeTest
{
	public static void main(String[] args)
	{
		List<String>mobs=new ArrayList<>();
		mobs.add("nokia");
		mobs.add("redmi");
		Employee emp=new Employee("deepak", new Date(),mobs, new Address(101, "bangalore"));
		emp.getDoj().setDate(14);
		emp.getName().replace("deepak", "raj");
		System.out.println(emp);
		emp.getMob().add("nokia");
		System.out.println(emp);
		Address ad1=emp.getAddress();
		ad1.setCity("delhi");
		ad1.setZip(1456);
		System.out.println(emp);
		
	}

}
