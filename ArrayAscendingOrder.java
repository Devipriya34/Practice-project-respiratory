package com.jsp.qualitlabs;

public class ArrayAscendingOrder {
	public static boolean isascending(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])	return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,50,55,90,100};
		if(isascending(arr))
		{
			System.out.println("Array is in Ascending Order");
		}
		else
		{
			System.out.println("Array is not in Ascending Order");
		}

	}

}
