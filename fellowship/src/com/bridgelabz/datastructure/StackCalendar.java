/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  printing the calendar using stack
 * FileName -  Stackcalendar.java
 * Date     -  20/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.Stack;
import com.bridgelabz.datastructure.basic.WeekDay;
import com.bridgelabz.utility.Utility;

public class StackCalendar {
	public static void main(String[] args) {
	
		Stack stack=new Stack();
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
	    Stack datestack=stack.toStack(ob, day, month, year);
		stack.display(datestack,original, month, year);
		
	}

}
