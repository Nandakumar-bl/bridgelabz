/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to convert the given decimal to binary  and to test it using JUnit.
 * FileName -  ToBinary.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class ToBinary {       //decimal to binary program

	
	public static void main(String[] args) {
		int decimal;
		
		System.out.println("enter a number to convert to binary");
		decimal=Utility.GetInt();   //getting a number to convert to binary;
		System.out.println(Utility.ConvertToBinary(decimal));
		
	}

}
