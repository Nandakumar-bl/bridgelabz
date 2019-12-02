/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  porgram to print the month of a year using queue
 * FileName -  QueueCalendar.java
 * Date     -  22/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.datastructure.basic.Queue;
import com.bridgelabz.datastructure.basic.WeekDay;
import com.bridgelabz.utility.Utility;

public class QueueCalendar {
	

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		WeekDay ob[]=new WeekDay[38];
		for(int k=0;k<38;k++)
		{
			
			ob[k]=new WeekDay();
		}
		
		int date=1;
		System.out.println("enter a month");
		int month=Utility.GetInt();
		System.out.println("enter a year");
		int year=Utility.GetInt();
		int day=Utility.DayOfWeek(date, month, year);
		int original=day;
		String s[]={"S  ","M  ","T  ","W  ","Th ","F  ","Sa "};
		for(String days:s)
			System.out.print(days);
		LinkedList queue=q.toQueue(ob, day, month, year);
		q.display(queue, original, month, year);
	
		

	}

}
