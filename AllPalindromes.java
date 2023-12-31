package com.jsp.string;

public class AllPalindromes 
{
     static boolean isPalindrome(String s,int start,int end)
     {
    	 int i=start;
    	 int j=end;
    	 while(i<j)
    	 {
    		 if(s.charAt(i)!=s.charAt(j)) return false;
    		 i++;
    		 j--;
    	 }
    	 return true;
     }
	public static void main(String[] args) {
		
       String s="malayalam";
       int count=0;
       String res=" ";
       for(int i=0;i<s.length()-1;i++)
       {
    	   for(int j=i+1;j<s.length();j++)
    	   {
    		    if(isPalindrome(s,i,j)) {
    		    	System.out.println(s.substring(i, j+1));
    		    	//count++;//No of Palindromes
//    		    	String temp=s.substring(i, j+1);
//    		    	if(temp.length()>res.length())
//    		    		{
//    		    		res=temp;
//    		    		}
    		    }
    		    
    	   }
       }
       //System.out.println(res);//Highest Palindrome
	}

}
