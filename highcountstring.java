package com.jsp.string;

public class highcountstring {

	public static void main(String[] args) {
		String s1="java is a programming language";
		String s2="";
		String[] sc=s1.split(" ");
		for(int i=0;i<sc.length;i++)
		{
			high(sc[i]);
	
		}

	}
	public static String high(String s)
	{
		String temp="";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			t=t+c+"";
			if(temp.length()<t.length())
			{
				temp=t;
			}
			
		}
		return temp;
	}

}
