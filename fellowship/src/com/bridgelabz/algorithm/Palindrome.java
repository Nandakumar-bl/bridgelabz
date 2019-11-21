/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to check whether the given String or Integer is a palindrome or not
 * FileName -  Palindrome.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("enter 1 for int and 2 for string");
		int choice=Utility.GetInt();
		switch(choice)
		{
		case 1:
		      System.out.println("Enter any number to check palindrome");
		      int check_int=Utility.GetInt();                       //getting integer input
		      System.out.println(Utility.CheckPalindrome(check_int));
		case 2:
		      System.out.println("Enter any word to check palindrome");
		      String check_str=Utility.GetLine();       //getting string input
		      System.out.println(Utility.CheckPalindrome(check_str));	
		}

}
	
}