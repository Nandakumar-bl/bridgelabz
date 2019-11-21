/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the binary of a given decimal and to find the decimal 
 *             after Swapping the nibbles and to test it using JUnit.
 * FileName -  Binary.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		int decimal;
		System.out.println("enter a number to convert to binary and to swap nibbles");
		decimal=Utility.GetInt();    //getting a number to convert to binary and to swpnibbles;
		System.out.println("decimal value of swapped nibble is "+Utility.ConvertToBinSwap(decimal));

	}

}
