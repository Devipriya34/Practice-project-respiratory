package com.jsp.string;

import java.util.Scanner;

public class halfrevstring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1=new Scanner(System.in).next();
		String s2="";
		int n=s1.length()/2;//4
		String s3=s1.substring(n);
		System.out.println(n);
		System.out.println(s3);//ledge
		String s4=s1.substring(0,n);
		System.out.println(s4);//know
		String t="";
		for(int i=s4.length()-1;i>=0;i--)
		{
			char c=s4.charAt(i);
			 t=t+c+"";
		
		}
		s2=s2+s3+t;
        System.out.println(s2);
		
	}

}
