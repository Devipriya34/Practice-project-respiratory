package com.jsp.string;

public class Anagram {
	public static void main(String[] args)
	{
	String s1="army";
	String s2="Marry";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.length()==s2.length())
	{
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				System.out.println("not an anagram");			
			}
				
		}
		System.out.println("anagram");
	}
	else
	{
		System.out.println("not an anagram");
	}
}

}
