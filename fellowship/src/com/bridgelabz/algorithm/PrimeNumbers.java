/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Printing the prime numbers found between the given min and max value
 * FileName -  PrimeNumbers.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		int max,min;
		System.out.println("Enter the maximum value");
		max=Utility.GetInt();
		System.out.println("Enter the minimum value");
		min=Utility.GetInt();
		        //prints prime between the range
		Utility.PrintPrimes(min, max);
		

	}

}
