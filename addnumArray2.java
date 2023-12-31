package com.jsp.companyprograms;

public class addnumArray2 {

	public static void main(String[] args) {
		int a[]= {10,2,7,4,8,5,9,3};
		double n=Math.random();
		int min=0;
		int max=a.length-1;
		int n1=(int)n*(max-min+1);
		System.out.println(n1);
		 System.out.println("getting index value of " +n1+"is :"+a[n1]);
		 System.out.println("getting index value of " +(n1+1)+"is :"+a[n1+1]);
		 a[n1+1]=100;
		 //System.out.println(a[n+1]);
		 for(int i:a)
		 {
			 System.out.println(i);
		 }
	}

}
