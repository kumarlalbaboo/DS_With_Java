package com.logical.program.interview;

public class Address 
{
	private int id;
	private int zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address(int id, int zip) {
		super();
		this.id = id;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", zip=" + zip + "]";
	}
	
	
}
