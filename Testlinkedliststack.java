package com.jsp.collections;

public class Testlinkedliststack {

	public static void main(String[] args) {
		 Linkedliststack l1=new  Linkedliststack();
		 l1.push(10);
		 l1.push(20);
		 l1.push(30);
		 l1.push(40);
		 System.out.println("the peek element of the stack is:"+l1.peek());
		 System.out.println(l1.size());
		 System.out.println("The deleted element from stack is:"+l1.pop());
		 System.out.println(l1.size());
		 

	}

}
