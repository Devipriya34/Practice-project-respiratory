package com.jsp.collections;

public class Arraylist {
	private Object[]a;
	private int p;
	public Arraylist()
	{
		a=new Object[5];
		p=0;
	}
	public void add(Object e)
	{
		if(p>a.length)increase();
		a[p]=e;
		p++;
	}
	private void increase()
	{
		Object[] temp=new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0,a.length);
		a=temp;
		
	}
	public int size() {
		return p;
	}
	public Object get(int index)
	{
		if(index<0|| index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void add(int index,Object e)
	{
		if(index<0 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
	  System.arraycopy(a, index, a, index+1, p-index);
	  a[index]=e;
	  p++;
	}
	public void remove(int index)
	{
		if(index<0  || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		System.arraycopy(a,index+1,a,index,p-index-1);
		p--;
		a[p]=null;
		
	}
}

