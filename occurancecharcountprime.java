package com.jsp.string;
import java.util.Scanner;

public class occurancecharcountprime {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1=new Scanner(System.in).next();
		int oc=0;
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
		
				}
			}
			if(count>oc)
			{
				ch=c;
				oc=count;
			}
			
		}
		System.out.println(ch);
		int n=(int)ch;
		
		if(n<=1)
		{
			System.out.println("It is not prime number");
		}
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(i%n==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(n+"It is prime number");
			
		}
		else
		{
			System.out.println(n+"It is not prime number");
		}
		
		System.out.println("****************************");
		
		
		if(oc<=1)//if(n<=1)
		{
			System.out.println("It is not prime number");
		}
		for(int i=2;i<=oc/2;i++)
		{
			if(i%oc==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(oc+"It is prime number");
			
		}
		else
		{
			System.out.println(oc+"It is not prime number");
		}
		

	}

}
