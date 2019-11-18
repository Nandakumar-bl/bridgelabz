package com.bridgelabz.logical;

import com.bridgelabz.utility.utility;

public class Gambler {

	public static void main(String[] args) 
	{

		System.out.println("Enter Stake value: ");

		int Stake=utility.getInt();

		System.out.println("Enter Goal value: ");

		int Goal=utility.getInt();

		System.out.println("Enter number of times: ");

		int noOfTimes=utility.getInt();

		utility.gambling(Stake, Goal, noOfTimes);	
		
	}
		
	

}