/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the Eucledian distance for the given X and Y values.
 * FileName -  Distance.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Distance {
	
	public static void main(String[] args) 
	{
		System.out.println("enter x value");
		int x=Utility.GetInt();           //gets input
		System.out.println("Enter y value");
		int y=Utility.GetInt();           //gets input
		System.out.println("The Eucledian distance for("+x+","+y+") is:"+Utility.FindEdistance(x,y));
		

	}

}
