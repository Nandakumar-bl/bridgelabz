/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  basic program for creating the linkedlist;
 * FileName -  LinkedList.java
 * Date     -  20Z/11/2019
 */
package com.bridgelabz.stock.Utility;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class LinkedList<E>
{
	public class node<E>
	{
		node next;
		E data;
		E day;
	}
	
    public node head=null;
	FileOutputStream file;
	DataOutputStream dis;

public void push(E data)
{
	node ins=new node();
	ins.data=data;
	ins.next=null;
	if(head==null)
		head=ins;     
	else
	{
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=ins;
	}
		
}
public void enqueue(E data)
{
	node ins=new node();
	ins.data=data;
	ins.next=null;
	if(head==null)
		head=ins;     
	else
	{
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=ins;
	}
		
}

public E dequeue()
{
	node<E> temp=head;
	E value=temp.data;
	head=head.next;
	return value;
}

public E peek()
{
	
	node<E> temp=head;
	while(temp.next!=null)
		temp=temp.next;
	return temp.data;
}
public void insert(E data)
{
	node ins=new node();
	ins.data=data;
	ins.next=null;
	if(head==null)
		head=ins;     
	else
	{
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=ins;
	}
}

public void insertAt(E data,int index)
{
	node prev=null,next=head;
	node n=new node();
	n.data=data;
	if(index==0)
	{
		n.next=head;
		head=n;
	}
	else
	{
	for(int i=0;i<index;i++)
	{
		prev=next;
		next=next.next;
	}
	prev.next=n;
	n.next=next;
	}
}
public <E extends Comparable<E>>int orderIndex(E data)
{
	node<E> temp=head;
	for(int i=0;temp!=null;i++)
	{
		if(temp.data.compareTo(data)<0)
		{
			temp=temp.next;
		}
		else
		{
			return i;	
		}
			
	}
	return 0;
}

public boolean isEmpty()
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
public void pop(int  index)
{
	node back=head;
	node middle=head;
	node front=head;
	if(index==0)
		head=head.next;
	else
	{		
	  for(int i=0;i<=index;i++)
	   {
	    	back=middle;
		    middle=front;
		    front=front.next;
	   }
	   back.next=front;
    }
}

public <E extends Comparable<E>> boolean search(E[] str,E find)
{	
 

  for(int i=0;i<str.length;i++)
  {
	 if(str[i].compareTo(find)==0)
	 {
		return true;
	 } 
  }
  return false;	
}

public E pop()
{
	node<E> current=head;
	node previous=head;
	E temp;
	while(current.next!=null)
	{
		previous=current;
		current=current.next;
	}
	if(current==previous)
		head=null;
	temp=current.data;
	previous.next=null;
	return temp;
}

public void popAt(int index)
{
	node current=head;
	node previous=head;
	node<E> next=head;
	
	for(int i=0;i<=index;i++)
	{
		if(index==0)
		{
		head=head.next;
		break;
		}
		else if(size()-1==index && next.next==null)
		{
		current.next=null;
		break;
		}
	    previous=current;
		current=next;
		next=next.next;
		if(i==index)
			previous.next=next;
		}
}

public <E extends Comparable<E>> void remove(E data)
{
node<E> current=head;
node<E> previous=head;
node<E> next=head;
if(current.data.compareTo(data)==0)
head=head.next;
else{
while(current!=null)
{
  if(current.data.compareTo(data)==0)
  {
previous.next=next;
break;
  }
  else if(next.next==null && ((next.data).compareTo(data))==0)
  {
  current.next=null;
   break;
  }
previous=current;
current=next;
next=next.next;
}
}
}
public void toFile() throws Exception
{
	node temp=head;
	String str="",f_name;
	System.out.println("enter the new file name to store processed list");
	f_name=Utility.GetLine();
	file=new FileOutputStream(f_name);
	dis=new DataOutputStream(file);
	while(temp!=null)
	{
		str=str+temp.data+",";
		temp=temp.next;
	}
	dis.writeUTF(str);
	dis.close();
}

public void toFileHash(LinkedList link[]) throws Exception
{
	node temp=head;
	int count=0;
	String rewrite="",f_name;
	System.out.println("enter the new file name to store processed list");
	f_name=Utility.GetLine();
	file=new FileOutputStream(f_name);
	dis=new DataOutputStream(file);
	for(int i=0;i<link.length;i++)
	{
		if(!link[i].isEmpty())
		{
		while(link[i].head!=null ){
		
			rewrite=rewrite+link[i].dequeue()+",";
		}}
		else
		{
			rewrite=rewrite+"null,";
		}
		System.out.print("  ");
		}
	dis.writeUTF(rewrite);
	dis.close();
}

public void print()
{
	node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}



}
