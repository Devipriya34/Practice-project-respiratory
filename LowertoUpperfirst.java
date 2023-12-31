package com.jsp.companyprograms;

public class LowertoUpperfirst {

	public static void main(String[] args) {
		 String s = "java is life";
	        char r = s.charAt(0);
	        r = (char) (r - 32);
	        String s1 = "" + r;
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == ' ') {
	                char ch = s.charAt(i + 1);
	                ch = (char) (ch - 32);
	                s1 += " ";
	                s1 += ch;
	                i++;
	            } else {
	                s1 += s.charAt(i);
	            }
	        }
	        System.out.println(s1);

	}

}
