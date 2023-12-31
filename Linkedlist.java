package com.jsp.collections;

public class Linkedlist {

	private Node1 first=null;
	private int count=0;
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node1(e,null);
			count++;
			return;
		}
		Node1 curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new  Node1(e,null);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<0 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node1 curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}

}
