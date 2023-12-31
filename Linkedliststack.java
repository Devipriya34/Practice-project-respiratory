package com.jsp.collections;

public class Linkedliststack {
	private Node1 first=null;
	private int count=0;
	
//	add method
	public void push(Object e)
	{
		if(first==null)
		{
			first= new Node1(e, null);
			count++;
			return;
		}
		Node1 temp=new Node1(e,null);
		temp.next=first;
		first=temp;
		count++;
	}
	
//	size method
	public int size()
	{
		return count;
	}
//	isEmpty method
	public boolean isEmpty()
	{
		if(first==null)
		{
			return true;
		}
		return false;
	}
	
//	pop method
	public Object pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("there is no element");
			throw new IndexOutOfBoundsException();
		}
		Object temp= first.ele;
		first=first.next;
		count--;
		return temp;
	}
	
//	peek method
	public Object peek()
	{
		if(isEmpty())
		{
			System.out.println("there is no element, first go and add");
			throw new IndexOutOfBoundsException();
		}
		return first.ele;
	}

}
