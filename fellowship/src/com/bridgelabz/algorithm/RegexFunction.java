/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to replace the default message with user details using REGEX function.
 * FileName -  RegexFunction.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import java.util.Date;

import com.bridgelabz.utility.Utility;

public class RegexFunction{

	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		System.out.println("enter the first name");
		String msg="hello <<name>>,we have your <<fullname>> in our system.your contact number is 91-xxxxxxxxxx.please let us know in case of any clarification,ThankYou bridgelabz xx/xx/xxxx";
		user1.setfName(Utility.GetLine());               //getting user first name
		System.out.println("enter the full name");
		user1.setlName(Utility.GetLine());             //getting user last name
		System.out.println("enter the mobile number");
		user1.setmobileNo(Utility.GetLine());       //getting user contact
		user1.setdate(Utility.GetFormatedDate(new Date()));   //getting current date
	    
		System.out.println(Utility.ConvertString(user1, msg));
	}

}
