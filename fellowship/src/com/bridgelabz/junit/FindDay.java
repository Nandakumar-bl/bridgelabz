/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the day for the input date and to test it using JUnit.
 * FileName -  FindDay.java
 * Date     -  19/11/2019
 */

package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
//program to find the day of the week


public class FindDay 
{

public static void main(String args[])
{
	System.out.println("enter a date");
	int date=Utility.GetInt();
	System.out.println("enter a month");
	int month=Utility.GetInt();
	System.out.println("enter a year");
	int year=Utility.GetInt();
	String days[]= {"sunday","monday","tuesday","wednesday","thursdday","friday","saturday"};
	String curr_day=days[Utility.DayOfWeek(date,month,year)];
    System.out.println("the day is :"+curr_day);     //printing the day according to date
}
}
