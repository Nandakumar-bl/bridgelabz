/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to convert the given celsius to farenheit and vice versa and to test it using JUnit.
 * FileName -  TempConv.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;    //program to convert celsius to farenheit and vice-versa

public class TempConv {

	public static void main(String[] args) {
		int temp,choice;
		System.out.println("enter 1.to convert from celsius to farenheit and 2 to convert vice versa");
		choice=Utility.GetInt();
		System.out.println("enter the temperature");
		temp=Utility.GetInt();
		Utility.TemperatureConversion(temp,choice);

	}

}
