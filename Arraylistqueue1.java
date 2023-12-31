package com.jsp.collections;

public class Arraylistqueue1 {
	private Object[]a;
	private int p;
	private int rear;
	private int front;
	public Arraylistqueue1()
	{
		a=new Object[2];
		p=0;
		rear=-1;
		front=0;
	}
	public void push(Object e)
	{
		if(full())increase();
		
		if(rear==a.length-1)
			{
			rear=-1;
			}
		a[rear]=e;
		rear++;
	     p++;
		
	}
	public void increase()
	{
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0,a.length);
		a=temp;
	}
	public Object poll()//delete the queue elements from front
	{
		if(rear==-1)
		{
			throw new IndexOutOfBoundsException();
		}
		Object t=a[front++];
		if(front==a.length)
		{
			front=0;
		}
		p--;
		return t;
	}
	public int size() 
	{
		return p;
	}
	public boolean full()
	{
		return(a.length-1==p);
	}
	public boolean isEmpty()
	{
		return (size()==0);
	}
	public Object peek()
	{
		return a[front];
	}

}
