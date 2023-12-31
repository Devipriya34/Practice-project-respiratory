package com.jsp.companyprograms;

import java.util.Scanner;

public class stringprogram {

	public static void main(String[] args) {
		//String s="Kitten";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s =sc.next();
		String temp="";
		String t="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'|| s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				char c=s.charAt(i);
				s2+=c;
			}
		
		}
		if(s2.length()<2)
		{
			for(int i=0;i<s2.length();i++) 
			{
			temp+=s2+s2+s2;
			
			}
			System.out.println("The modified string is:"+temp);
		}
		
		else
		{
			String s1=s2.substring(0,2);
			System.out.println("The old String is :"+s2);
				t=s1+s2+s1;
			System.out.println("The modified String is :"+t);
				
				
			
		}
		
		


	}

}
