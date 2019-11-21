/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to print the power of 2 till n.
 * FileName -  PowerOf2.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		int power;
		System.out.println("enter a number to print the power of 2");
		power=Utility.GetInt();
		Utility.PowerOf2(power);

	}

}
