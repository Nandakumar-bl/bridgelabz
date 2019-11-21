package com.bridgelab.datastructures;

import com.bridgelabz.utility.utility;

public class OrderedList<E> {
	node head=null;   
	
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
	public void remove(E data)
	{
		node current=head;
		node previous=head;
		node next=head;
		if(head.data==(data))
			head=head.next;
		while(current.next!=null)
		{
		   if(current.data==(data))
		   {
			previous.next=next;
			break;
		   }
		   else if(next.next==null && next.data==(data))
			   current.next=null;
			   
			   
			previous=current;
			current=next;
			next=next.next;
		}
	}
		public boolean search(int[] str,int find)
		{	
	     
		
		  for(int i=0;i<str.length;i++)
		  {
			 if(str[i]==(find))
			 {
				return true;
			 } 
		  }
		  return false;	
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
			
	

	public static void main(String[] args) {
		OrderedList link=new OrderedList();
		String file;
		int find;
		System.out.println("Enter the file name");
		file=utility.getLine();
		String str[]=utility.readfile(file).split(" ");
		int[] arr=new int[str.length];
         for(int i=0;i<str.length;i++)
        	 arr[i]=Integer.parseInt(str[i]);
		System.out.println("Enter a number to find");
    	    find=utility.getInt();
    	    
    	    utility.bubblesort(arr);
    	 for(int j=0;j<arr.length;j++)
    		 link.insert(arr[j]);
    	 
    	 if(link.search(arr, find))
		 	 link.remove(find);
    	  else
     	  {
			link.insert(find);
		   }
    	 
    	 link.print();

	}

}
