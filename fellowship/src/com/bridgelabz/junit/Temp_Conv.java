package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;

public class Temp_Conv {

	public static void main(String[] args) {
		int temp,choice;
		System.out.println("enter 1.to convert from celsius to farenheit and 2 to convert vice versa");
		choice=utility.getInt();
		System.out.println("enter the temperature");
		temp=utility.getInt();
		utility.temperature_conversion(temp,choice);

	}

}
