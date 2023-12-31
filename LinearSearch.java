package com.jsp.searching;

public class LinearSearch {
	public static int search(int[]a,int e)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==e) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]a= {3,4,6,9,5,2};
		System.out.println(search(a,2));
		System.out.println(search(a,5));
		System.out.println(search(a,8));


	}

}
