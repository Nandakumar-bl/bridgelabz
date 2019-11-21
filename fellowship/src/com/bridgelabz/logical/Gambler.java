/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Simulates a gambler who start with $stake and place fair $1 bets until he/she goes 
 *             broke (i.e. has no money) or reach $goal.
 * FileName -  Gambler.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;  //gambler program

public class Gambler {

	public static void main(String[] args) 
	{

		System.out.println("Enter Stake value: ");

		int Stake=Utility.GetInt();            //getting stake value

		System.out.println("Enter Goal value: ");

		int Goal=Utility.GetInt();             //setting the goal

		System.out.println("Enter number of times: ");

		int noOfTimes=Utility.GetInt();        //getting the number of times

		Utility.Gambling(Stake, Goal, noOfTimes);	
		
	}
		
	

}