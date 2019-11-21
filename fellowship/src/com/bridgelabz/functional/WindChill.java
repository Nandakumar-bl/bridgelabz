/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find windchill using the temperature and wind speed as input.
 * FileName -  WindChill.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
                                        //program to calculate the wind chill
public class WindChill {
	
	
	public static void main(String[] args) {
		int t,v;
		System.out.println("enter the temperature");
		t=Utility.GetInt();                //gets temperature
		System.out.println("enter the wind speed in miles per hour");
		v=Utility.GetInt();                  //gets wind speed
		Utility.FindWindchill(t, v);
	}

}
