package com.jsp.string;

public class stringBuffer {

	public static void main(String[] args) {
		String s="Gayathri";
		//char[] c={'a','b'};
		StringBuffer sb=new StringBuffer(s);
		sb.append(567);
		System.out.println(sb);
	}

}