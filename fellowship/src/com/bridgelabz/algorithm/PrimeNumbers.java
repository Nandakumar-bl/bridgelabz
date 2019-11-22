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
		 String str[]=Utility.PrintPrimes(min, max).split(" ");
	        Integer arr[]=new Integer[str.length];
	        for(int i=0;i<str.length;i++)
	        	arr[i]=Integer.parseInt(str[i]);
	        for(int i=0;i<arr.length;i++)
	        	System.out.println(arr[i]+"is a prime number");
		

	}

}
