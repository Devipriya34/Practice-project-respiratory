package com.jsp.string;

import java.util.Arrays;

public class RemoveDuplicateStrings 
{
	 
	
	public static void main(String[] args)
	{
		
		String s="abc water ends here abc water now";
		String[]a=s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
					a[j]="null";
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("The original String is :"+s);
		for(String b:a) 
		{
			if(b!="null")
			{
				s1+=b+" ";
				
			}
		}
		System.out.println(s1);
	}

}
