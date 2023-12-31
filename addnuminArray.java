package com.jsp.companyprograms;

import java.util.Scanner;

public class addnuminArray {

	public static void main(String[] args) {
		int[]a= {10,2,7,1,4,6,8};
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the index value:");
		 int n=sc.nextInt();
		 System.out.println("getting index value of " +n+"is :"+a[n]);
		 System.out.println("getting index value of " +(n+1)+"is :"+a[n+1]);
		 a[n+1]=100;
		 //System.out.println(a[n+1]);
		 for(int i:a)
		 {
			 System.out.println(i);
		 }

	}

}
