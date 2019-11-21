/* Author   -  Nanda kumar.s 
 * Version  -  1.2
 * Purpose  -  program to check whether the giving input is a year leap year or not.
 * FileName -  LeapYear.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("enter a year to check whether it is leap year or not");
		year=Utility.GetInt();         //getting input to find leap year
		System.out.println(Utility.CheckLeap(year));
	

	}

}
