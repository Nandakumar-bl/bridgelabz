/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the Roots of the Quadratic Equation.
 * FileName -  Quadratic.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

		public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter a");
	     a=Utility.GetInt();
	     System.out.println("enter b");
	     b=Utility.GetInt();
	     System.out.println("enter c");
		c=Utility.GetInt();

		Utility.FindRoots(a,b,c);
		
		

	}

}
