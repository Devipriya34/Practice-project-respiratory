package com.jsp.comparator;

public class LaptopBrandCompare implements java.util.Comparator {
	public int compare(Object o1, Object o2) {
		Laptop1 p1 = (Laptop1) o1;
		Laptop1 p2 = (Laptop1) o2;
		String s1 = p1.brand;
		String s2 = p2.brand;
		return s1.compareTo(s2);
	}
}

 



