package com.jsp.collections;

public class Arrayliststack {
	private Object[]a;
	private int p;
	private int top;
	public Arrayliststack()
	{
		a=new Object[2];
		top=-1;
	}
	public void push(Object e)
	{
		if(full())increase();
		a[++top]=e;
		
	}
	public void increase()
	{
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0,a.length);
		a=temp;
	}
	public Object pop() 
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		return a[top--];
	}
	public boolean full()
	{
		return top == a.length-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
		
	}
	public int size()
	{
		return top+1;
		
	}
	public Object peek()
	{
		 return a[size()-1];

	}
	

}
