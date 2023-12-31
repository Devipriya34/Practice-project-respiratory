package com.jsp.sorting;

import java.util.Arrays;

public class BubbleSort {
	static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
						{
					      int t=a[j];
					      a[j]=a[j+1];
					      a[j+1]=t;						}
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {4,5,2,8,6,9};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
