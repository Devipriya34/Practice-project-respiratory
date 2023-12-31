package com.jsp.collections;

public class Node {
	Object ele;
	Node next;
	Node prev;
	
	private Node(Object e,Node n)
	{
		ele=e;
		next=n;
	}
	public Node(Object e, Node p, Node n)
	{
		this(e,n);
		prev=p;
	}
}
