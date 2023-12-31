package com.jsp.string;

public class swaptwostrings {

	public static void main(String[] args) {
		String s1="gayathri";
		String s2="sree";
		int l1=s1.length();
		int l2=s2.length();
		s1=s1+s2;
		System.out.println(s1);
		int l3=s1.length();
		s2=s1.substring(0, l1);
		s1=s1.substring(l1);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
