/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  basic program to implement stack.
 * FileName -  Stack.java
 * Date     -  21/11/2019
 */
package com.bridgelabz.datastructure.basic;

import com.bridgelabz.datastructure.basic.LinkedList.node;
import com.bridgelabz.utility.Utility;

public class Stack<E> {
	static Stack<Object> stack1=new Stack();
	static Stack<Object> stack2=new Stack();
	public node head=null;

	public class node<E>
	{
		node next;
		E data;
		E day;
	}
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
	 public static Stack toStack(WeekDay[] ob,int day,int month,int year){

			int k=0;
			String s[]={"S  ","M  ","T  ","W  ","Th ","F  ","Sa "};

			for(int i=1;i<=31;i++)
			{
				ob[k].day=s[day];
				ob[k].date=i+"";
				if(day==6)
					day=0;
				day++;
				stack1.push(ob[k].day);
				stack2.push(ob[k].date);
				k++;
				if(Utility.CheckLeap(year)&& month==2 && i == 29)
				    break;
					else if(month ==2 && i ==28)
					break;
					else if(month == 4 || month ==6 || month==9  ||month==11  && i==30) 
					break;
			}
			return stack2;
		}

		public static void display(Stack stack,int day,int month,int year)
		{
			int j=0,count=0;
			System.out.println();
			
			for(int i=0;i<day;i++){
				System.out.print("   ");
			    count++;
			}
		
			if(Utility.CheckLeap(year)&& month==2 )
			    j=30;
				else if(month ==2)
				j=29;
				else if(month == 4 || month ==6 || month==9  ||month==11) 
				j=31;
				else j=32;
			for(;j>1;)
			{
				Integer Date=j-Integer.parseInt(stack.pop()+"");
				if(Date<10)
				   System.out.print(Date+"  ");
				else
					System.out.print(Date+" ");
				count++;
				if(count%7==0)
				{
					System.out.println();
				}
				if(Date==j-1)break;
			}
			
		}

}
