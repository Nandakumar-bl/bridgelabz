/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the Square root of the input using newton method and to test it using JUnit.
 * FileName -  SquareRoot.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility; //program to find square root

public class SquareRoot {


	public static void main(String[] args) {
		double Num;
		System.out.println("enter the number to find sqrt");
		Num=Utility.GetDouble();           //getting the input
	    System.out.println("the sqrt of"+Num+" is "+Utility.Sqrt(Num));

	}

}
