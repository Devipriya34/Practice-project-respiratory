package com.jsp.companyprograms;

public class LowertoUppAll {

	public static void main(String[] args) {
		 String s = "java is life";
	     
	        String s1 = "" ;
	        for (int i = 0; i < s.length(); i++)
	        {
	        	char ch=s.charAt(i);
	        	char c=(char)(ch-32);
	        	s1=s1+c;
	        	
	            
	        }
	        System.out.println(s1);

	}

}
