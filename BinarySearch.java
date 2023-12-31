package com.jsp.searching;

public class BinarySearch {
   public static int search(int[]a, int e)
   {
	  int first=0;
	   int last=a.length;
	   while(first<=last)
	   {
		   int mid=(first+last)/2;
		   if(e==a[mid])return mid;
		   else if(e<=a[mid]) last=mid-1;
		   else
		   {
			   first=mid+1;
		   }
		   
	   }
	   return -1;
   }
	public static void main(String[] args) {
		int[]a= {2,4,6,8,9};
		System.out.println(search(a,2));
		System.out.println(search(a,4));
		System.out.println(search(a,9));


	}

}
