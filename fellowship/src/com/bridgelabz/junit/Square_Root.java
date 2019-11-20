package com.bridgelabz.junit;

import com.bridgelabz.utility.utility; //program to find square root

public class Square_Root {


	public static void main(String[] args) {
		double Num;
		System.out.println("enter the number to find sqrt");
		Num=utility.getDouble();           //getting the input
	    System.out.println("the sqrt of"+Num+" is "+utility.sqrt(Num));

	}

}
