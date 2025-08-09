package com.logical.program.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee 
{
	private final String name;
	private final Date doj;
	private final List<String>mobile;
	private final Address address;
	
	public Employee(String name, Date doj, List<String> mobile, Address address) {
		super();
		this.name = name;
		this.doj = doj;
		this.mobile = mobile;
		this.address = address;
	}


	public String getName() {
		return name;
	}

	public Date getDoj() {
		return (Date) doj.clone();
	}

	public List<String> getMobile() {
		return new ArrayList<String>(mobile);
	}
	
	

	public Address getAddress() {
		return new Address(address.getId(), address.getZip());
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", doj=" + doj + ", mobile=" + mobile + ", address=" + address + "]";
	}


	
	
	

}
