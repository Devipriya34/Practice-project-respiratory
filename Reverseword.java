package com.jsp.qualitlabs;

public class Reverseword {

	public static void main(String[] args) {
		String s="Java is easy";
		String[] a=s.split(" ");
		String res=" ";
		String result=" ";
		for(int i=0;i<a.length;i++)
		{	res=a[i]+res;
			res+=" "; 
		}
		System.out.println(res);
		
		
	}

}
