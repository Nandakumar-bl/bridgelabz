/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to print the percentage of heads and tails for the number of flips
 *             made by the coin.
 * FileName -  FlipCoin.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		  int flips;
		  System.out.println("enter the number of coin flips");
		  flips=Utility.GetInt();   //getting the number of flips
		  Utility.FlipCoin(flips);
		// TODO Auto-generated method stub

	}

}
