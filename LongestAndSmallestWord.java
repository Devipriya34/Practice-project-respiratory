package com.jsp.qualitlabs;

public class LongestAndSmallestWord {

	public static void main(String[] args) 
	{
		
     String s="Java is object oriented";
     String[] word=s.split(" ");
     String Longestword=word[0];
     String smallestword=word[0];
     for(int i=1;i<word.length;i++)
     {
    	 if(Longestword.length()<word[i].length())
    		Longestword=word[i];
    	 if(smallestword.length()>word[i].length())
    		 smallestword=word[i];
     }
     System.out.println("Longest word in a string is:"+Longestword);
     System.out.println("smallest word in a string is:"+smallestword);
	}

}
