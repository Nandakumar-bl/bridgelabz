/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to find the prime factorization of the given input
 * FileName -  PrimeFact.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class PrimeFact {

	public static void main(String[] args) {
		int Number;
		System.out.println("Enter a number to find the Prime factorization of it");
		Number=Utility.GetInt();
		Utility.PrimeFact(Number);

	}

}
