package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;    //program to get monthly payment

public class MonthPayment {

	
	public static void main(String[] args) {
		System.out.println("ënter the principle amount");
		int principal=utility.getInt();
		System.out.println("ënter the rate of intrest");
		int rate=utility.getInt();
		System.out.println("ënter the years");
		int year=utility.getInt();
		System.out.println("monthly payment for principle"+principal+" is :"+utility.monthypayment(principal, rate, year));

	}

}
