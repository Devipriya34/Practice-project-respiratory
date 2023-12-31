package com.jsp.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStrings 
{
	public static String[] duplicateString(String s)
	{
		Set<String> res=new LinkedHashSet<>();
		Set<String> res1=new LinkedHashSet<>();
		String[]arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					res.add(arr[i]);
					break;
				}
			}
		}
		String resu[]=new String[res.size()];
		System.arraycopy(res.toArray(), 0, resu, 0, res.size());
		return resu;
		
		
	}

	public static void main(String[] args)
	{
		String s="abc water ends abc ends here";
		System.out.println(s);
		String result[]=duplicateString(s);
		System.out.println(Arrays.toString(result));
		

	}

}
