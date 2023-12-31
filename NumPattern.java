package com.jsp.patterns;

public class NumPattern {

	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(num+" ");
				num*=num;
			}
			num=3;
			System.out.println();
		}

	}

}

//3 9 81 6561 
//3 9 81 
//3 9 
//3 