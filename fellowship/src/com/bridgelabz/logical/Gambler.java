package com.bridgelabz.logical;

import com.bridgelabz.utility.utility;  //gambler program

public class Gambler {

	public static void main(String[] args) 
	{

		System.out.println("Enter Stake value: ");

		int Stake=utility.getInt();              //getting stake value

		System.out.println("Enter Goal value: ");

		int Goal=utility.getInt();              //setting the goal

		System.out.println("Enter number of times: ");

		int noOfTimes=utility.getInt();          //getting the number of times

		utility.gambling(Stake, Goal, noOfTimes);	
		
	}
		
	

}