package com.jsp.sorting;

import java.util.Arrays;

public class SelectionSort {
	static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=index+1;j<a.length-1;j++)
			{
				if(a[index]>a[j])index=j;
			}
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	

	public static void main(String[] args) {
		int[]a= {4,5,2,8,8,6,9};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));

	}

}
