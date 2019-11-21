/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to generate coupon number
 * FileName -  CouponNumber.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;    //program to generate coupon

public class CouponNumber 
{
	
	public static void main(String args[])
	{
		int no_of_coupon;
		System.out.println("enter how many coupons to generate");
		no_of_coupon=Utility.GetInt();
		Utility.CouponGeneration(no_of_coupon);
		
		
	}
	

}
