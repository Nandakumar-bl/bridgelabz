/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  basic program to implement queue.
 * FileName -  Queue.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.datastructure.basic;
import com.bridgelabz.datastructure.basic.*;
import com.bridgelabz.datastructure.basic.LinkedList.node;
import com.bridgelabz.utility.Utility;

public class Queue<E> {
	  public class node<E>
		{
			node next;
			E data;
			E day;
		}
   node head=null;
	 
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

	public static LinkedList toQueue(WeekDay[] ob,int day,int month,int year){

		LinkedList<Object> queue=new LinkedList();
		int k=0;
		String s[]={"S  ","M  ","T  ","W  ","Th ","F  ","Sa "};
		for(int i=0;i<day;i++){
			ob[k].day=s[i];
			ob[k].date="   ";
			queue.enqueue(ob[k++]);
		}
		for(int i=1;i<=31;i++)
		{
			ob[k].day=s[day];
			ob[k].date=i+"";
			if(day==6)
				day=0;
			day++;
			queue.enqueue(ob[k++]);
			if(Utility.CheckLeap(year)&& month==2 && i == 29)
			    break;
				else if(month ==2 && i ==28)
				break;
				else if(month == 4 || month ==6 || month==9  ||month==11  && i==30) 
				break;
		}
		return queue;
	}

	public static void display(LinkedList queue,int day,int month,int year)
	{
		int count=0;
		System.out.println();
		
		for(int i=0;i<day;i++){
			System.out.print(((WeekDay) queue.dequeue()).date);

		    count++;
		}
		for(int j=1;j<=31;j++)
		{
			Integer Date=Integer.parseInt(((WeekDay) queue.dequeue()).date);
			if(Date<10)
			   System.out.print(Date+"  ");
			else
				System.out.print(Date+" ");
			count++;
			if(count%7==0)
			{
				System.out.println();
			}
			if(Utility.CheckLeap(year)&& month==2 && j == 29)
			    break;
				else if(month ==2 && j ==(28))
				break;
				else if(month == 4 || month ==6 || month==9  ||month==11  && j==30) 
				break;
			
		}
	}
	
}
