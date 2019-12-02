/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to print a month of a calender using two dimensional  array
 * FileName -  Calendar.java
 * Date     -  22/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.Util;
import com.bridgelabz.utility.Utility;

public class calender {

	public static void main(String[] args) {
		int date=1;
		System.out.println("enter a month");
		int month=Utility.GetInt();
		System.out.println("enter a year");
		int year=Utility.GetInt();
		Util.PrintCalendar(date, month, year);
	}

}
