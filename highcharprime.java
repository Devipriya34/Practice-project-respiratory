package com.jsp.string;

import java.util.Scanner;

public class highcharprime {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1=new Scanner(System.in).next();
		int oc=0;
		int n1=0;
		char ch=s1.charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				
				if(c==s1.charAt(j))
				{
					count++;
					int n=(int)c;
					if(n1<n)
					{
						n1=n;
					}
		
				}
			}
			if(count>oc)
			{
				ch=c;
				oc=count;
			}
			
		}
		System.out.println(n1);
		
		char hc =(char)n1;
		System.out.println(hc);
		
		
		if(n1<=1)
		{
			System.out.println("It is not prime number");
		}
		int count=0;
		for(int i=2;i<=n1/2;i++)
		{
			if(i%n1==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(n1+"It is prime number");
			
		}
		else
		{
			System.out.println(n1+"It is not prime number");
		}
		
		

	}

}
