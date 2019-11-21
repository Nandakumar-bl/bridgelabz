/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the monthly payment for the given data and to test it using JUnit.
 * FileName -  MonthPayment.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;    //program to get monthly payment

public class MonthPayment {

	
	public static void main(String[] args) {
		System.out.println("�nter the principle amount");
		int principal=Utility.GetInt();
		System.out.println("�nter the rate of intrest");
		int rate=Utility.GetInt();
		System.out.println("�nter the years");
		int year=Utility.GetInt();
		System.out.println("monthly payment for principle"+principal+" is :"+Utility.MonthlyPayment(principal, rate, year));

	}

}
