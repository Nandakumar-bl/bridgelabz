/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to print the Harmonic number for the given input
 * FileName -  HarmonicNum.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class HarmonicNum {

	public static void main(String[] args) {
		 
		int N;
		System.out.println("Enter a N value to print the value of harmonic num");
		N=Utility.GetInt();  //getting the number to find harmonic number
		Utility.HarmonicNum(N);
		
		
	}

}
