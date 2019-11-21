/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to guess a number between a range and finding that Number using 
 *             the binary search algorithm 
 * FileName -  GuessGame.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;

public class GuessGame {

	public static void main(String[] args) {
		
		System.out.println("guess a no beween o to 127");
		Utility.GetInt();
		try
		{
			System.out.println("guessed no is"+Utility.Find());  //guessing a number
		}
		catch(Exception e)
		{
			System.out.println("enter correct input");      
		}

	}

}
