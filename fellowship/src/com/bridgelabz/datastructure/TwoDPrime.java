
/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Printing the prime numbers of a range using two dimensional array
 * FileName -  TwoDprime.java
 * Date     -  20/11/2019
 */package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.Util;
import com.bridgelabz.utility.Utility;

public class TwoDPrime {

	public static void main(String[] args) {
		int min,max,count=0;
		System.out.println("Enter the minimum range");
		min=Utility.GetInt();
		System.out.println("Enter the maximum range");
		max=Utility.GetInt();
        
		String str[]=Utility.PrintPrimes(min, max).split(" ");
        int arr[]=new int[str.length];
        
        for(int i=0;i<str.length;i++)
        {
        	arr[i]=Integer.parseInt(str[i]);
                   
        }
        Util.PrintTwoDi(arr);
        
        	
	}

}
