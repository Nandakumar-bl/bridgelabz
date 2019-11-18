package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;

public class FindDay 
{

public static void main(String args[])
{
	System.out.println("enter a date");
	int date=utility.getInt();
	System.out.println("enter a month");
	int month=utility.getInt();
	System.out.println("enter a year");
	int year=utility.getInt();
	String days[]= {"sunday","monday","tuesday","wednesday","thursdday","friday","saturday"};
	String curr_day=days[utility.dayofweek(date,month,year)];
    System.out.println("the day is :"+curr_day);
}
}
