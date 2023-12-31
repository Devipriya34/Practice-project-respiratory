package com.jsp.string;

public class LenOfLongString {

	public static void main(String[] args) {
	 String s="Java is easy programming languages";
	 String[] a=s.split("\\s");
	 String temp=" ";
	 for(int i=0;i<a.length;i++)
	 {
		 if(temp.length()<a[i].length())
		 {
			 temp=a[i];
		 }
	 }
	 System.out.println("The largest word is: "+temp);

	}

}
