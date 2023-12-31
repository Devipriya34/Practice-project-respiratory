package com.jsp.string;

public class panagram {

	public static void main(String[] args) {
		String s="cbadefghijklmnopqrstuvwxYzabc";
		s=s.toLowerCase();
		String res="";
		for(char ch='a';ch<'z';ch++)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
			char c=s.charAt(i);
			    if(ch==c)
			   {
				count++;
				break;
			    }
			
	       }
			
			if(count==0)
			{
				res+=res+ch;
			}
			
	    }
		//if(res.length()==0)
		if(res.length()==0)
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not an panagram");
		}
			

}
}
