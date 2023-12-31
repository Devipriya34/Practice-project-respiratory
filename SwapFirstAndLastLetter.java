package com.jsp.string;

public class SwapFirstAndLastLetter
{
 static char[] swap(String s)
 {
	 String temp="";
	 char[] c=s.toCharArray();
	     
		for(int k=0;k<c.length;k++)
		{
			
			char ch=c[c.length-1];
			c[k]=ch;
			c[c.length]=c[k+1];
			
		}
		return c;
 }
 static String m1(char[] c)
 {
	 String s3="";
	 for(int i=0;i<c.length;i++)
	 {
		char chs= c[i];
		String t=chs+"";
		s3+=t;
		s3+="";
	 }
	 return s3;
 }
	public static void main(String[] args)
	{
		String s="java is easy";
		String res=" ";
		String[]a=s.split("\\s");
		 for(int i=0;i<a.length;i++)
		 {
			char[]c=swap(a[i]);
			res+=m1(c);
			res+=" ";
		 }
		
		 
		System.out.println(res);
	
	}

}
