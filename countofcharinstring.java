package com.jsp.string;
import java.util.Scanner;

public class countofcharinstring {

	public static void main(String[] args) {
		System.out.println("Enter a string and Character");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			
			char ch=s1.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
