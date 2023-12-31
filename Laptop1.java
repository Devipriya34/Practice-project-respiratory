package com.jsp.comparator;

public class Laptop1 implements Comparable<Object> 
{
	String brand ;
	int price;
	
	
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]\n";
	}
	public Laptop1(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public int compareTo(Object o)
	{
		//high to low
		Laptop1 l1=(Laptop1)o;
		return this.price - l1.price;
	}
	
}
