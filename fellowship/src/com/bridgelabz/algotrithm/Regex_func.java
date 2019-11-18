package com.bridgelabz.algotrithm;

import java.util.Date;

import com.bridgelabz.utility.utility;

public class Regex_func {

	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		System.out.println("enter the first name");
		String msg="hello <<name>>,we have your <<fullname>> in our system.your contact number is 91-xxxxxxxxxx.please let us know in case of any clarification,ThankYou bridgelabz xx/xx/xxxx";
		user1.setfName(utility.getLine());
		System.out.println("enter the full name");
		user1.setlName(utility.getLine());
		System.out.println("enter the mobile number");
		user1.setmobileNo(utility.getLine());
		user1.setdate(utility.getFormatedDate(new Date()));
	    
		System.out.println(utility.convertString(user1, msg));
	}

}
