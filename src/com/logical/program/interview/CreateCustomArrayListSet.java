package com.logical.program.interview;

import java.util.ArrayList;

public class CreateCustomArrayListSet extends ArrayList
{
	
	@Override
	public boolean add(Object obj) {
		if (this.contains(obj)) {
			return true;
		} else {
			return super.add(obj);
		}
	}
	public static void main(String[] args) {
		CreateCustomArrayListSet ccl = new CreateCustomArrayListSet();
		ccl.add(1);
		ccl.add(1);
		ccl.add(1);
		ccl.add(2);
		ccl.add(2);
		System.out.println(ccl);
	}
}
