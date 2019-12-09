package com.bridgelabz.datastructure.basic;

	public class deque<E> {

		public class node<E>
		{
			node next;
			node tail;
			E data;
		}
		
	    public node<E> head=null;
	    public node<E> tail=null;
	    public void enqueue(E data)
	    {
	    	node ins=new node();
	    	ins.data=data;
	    	ins.next=null;
	    	if(head==null)
	    	{
	    		head=ins;     
	    	    tail=ins;
	    	}
	    	else
	    	{
	    		node temp=head;
	    		while(temp.next!=null)
	    		{
	    			temp=temp.next;
	    		}
	    		temp.next=ins;
	    		tail=temp.next;
	    	}
	    }
	    public void addfront(E item)
	    {
	    	node temp=new node();
	    	temp.data=item;
	    	temp.next=head;
	    	temp=head;
	    }
	    
	    public void addrear(E item)
	    {
	    	node temp=new node();
	    	temp.data=item;
	    	tail.next=temp;
	    	tail=temp;
	    }
	    public E removefront()
	    {
	    	E data;
	    	data=head.data;
	    	head=head.next;
	    	return data;
	    }
	    public E removerear()
	    {
	    	node<E> temp=new node();
	    	temp=head;
	    	E data=tail.data;
	    	if(head==tail)
	    		return head.data;
	    	while(temp.next!=tail)
	    	{
	    	temp=temp.next;	
	    	}
	    	tail=temp;
	    	tail.next=null;
	    	return data;
	    }
	    
	    public boolean isempty()
	    {
	    	if(head==null)
	    		return true;
	    	
	    	return false;
	    }
	    public int size()
	    {
	    	node temp=head;
	    	int count=0;
	    	while(temp!=null)
	    	{
	    		count++;
	    		temp=temp.next;
	    	}
	    	return count;
	 
	    }
	    public void print()
	    {
	    	node temp=head;
	    	while(temp!=null)
	    	{
	    		System.out.println(temp.data);
	    		temp=temp.next;
	    	}
	    }
	}
}
