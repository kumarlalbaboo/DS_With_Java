package com.logical.test.array;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee
{
private final String name;
private final Date doj;
private final List<String>mob;
private final Address address;
public Employee(String name, Date doj, List<String> mob, Address address) {
	super();
	this.name = name;
	this.doj = doj;
	this.mob = mob;
	this.address = address;
}
public String getName() {
	return name;
}
public Date getDoj() {
	return (Date) doj.clone();
}
public List<String> getMob() {
	return new ArrayList<String>(mob);
}
public Address getAddress() {
	return new Address(address.getZip(), address.getCity());
}
@Override
public String toString() {
	return "Employee [name=" + name + ", doj=" + doj + ", mob=" + mob + ", address=" + address + "]";
}


}
