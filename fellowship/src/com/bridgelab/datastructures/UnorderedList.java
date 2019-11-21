package com.bridgelab.datastructures;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import com.bridgelabz.utility.Utility;


public class UnorderedList<E> {
		node head=null;
		FileOutputStream file;
		DataOutputStream dis;
	
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
		 if(str[i].equals(find))
		 {
			return true;
		 } 
	  }
	  return false;	
	}
	
	public void pop()
	{
		node current=head;
		node previous=head;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
	}
	
	public <E extends Comparable<E>> void remove(E data)
	{
		node current=head;
		node previous=head;
		node<E> next=head;
		if(head.data.equals(data))
			head=head.next;
		while(current.next!=null)
		{
		   if(current.data.equals(data))
		   {
			previous.next=next;
			break;
		   }
		   else if(next.next==null && ((next.data).compareTo(data))==0)
			   current.next=null;
			   
			   
			previous=current;
			current=next;
			next=next.next;
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
	
	public void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) throws Exception
	{
		UnorderedList<Integer> link=new UnorderedList<Integer>();
		String file;
		Integer find;
		System.out.println("Enter the file name");
		file=Utility.GetLine();
		System.out.println("Enter a word to find");
    	find=Utility.GetInt();
		String str[]=Utility.ReadFile(file).split(",");
		Integer arr[]=new Integer[str.length];
		for(int j=0;j<str.length;j++)
			arr[j]=Integer.parseInt(str[j]);
			
	
    	 for(int j=0;j<str.length;j++)
    		 link.insert((Integer.parseInt(str[j])));
		if(link.search(arr, find))
		 	 link.remove(find);
    	  else
     	  {
			link.insert(find);
		   }
		
	    link.toFile();   

	}
		

}
