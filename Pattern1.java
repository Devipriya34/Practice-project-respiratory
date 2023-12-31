 package com.jsp.patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print(j+" ");
				}
				
			}
			
			else
			{
				int k=n;
				for(int j=1;j<=n;j++)
				{
					System.out.print(k+" ");
					k--;
				}
			}
			System.out.println();
		}
		
	}

}


//1 2 3 4 5 
//5 4 3 2 1 
//1 2 3 4 5 
//5 4 3 2 1 
//1 2 3 4 5 
