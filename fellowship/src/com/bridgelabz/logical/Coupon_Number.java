package com.bridgelabz.logical;

import com.bridgelabz.utility.utility;

public class Coupon_Number 
{
	
	public static void main(String args[])
	{
		int no_of_coupon;
		System.out.println("enter how many coupons to generate");
		no_of_coupon=utility.getInt();
		utility.cou_generation(no_of_coupon);
		
		
	}
	

}
