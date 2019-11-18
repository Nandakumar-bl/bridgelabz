package com.bridgelabz.functional;

import com.bridgelabz.utility.utility;

public class WindChill {
	
	
	public static void main(String[] args) {
		int t,v;
		System.out.println("enter the temperature");
		t=utility.getInt();                //gets temperature
		System.out.println("enter the wind speed in miles per hour");
		v=utility.getInt();                  //gets wind speed
		utility.find_windchill(t, v);
	}

}
