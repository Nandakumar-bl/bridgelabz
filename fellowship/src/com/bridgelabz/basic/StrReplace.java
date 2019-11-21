/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to replace the default message with the given String.
 * FileName -  StrReplace.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class StrReplace {

	public static void main(String[] args) {
			String u_name;
			System.out.println("enter the username");
			u_name=Utility.GetLine();      //getting input to replace string
			System.out.println(Utility.StrReplace(u_name));

	}

}
