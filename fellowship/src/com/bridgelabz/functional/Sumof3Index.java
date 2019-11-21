/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to Find the three index in an array which gives a sum of xero.
 * FileName -  Sumof3Index.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
                                  //program to calculate the indexes of 3 in array gives sum 0
public class Sumof3Index {
	
		public static void main(String[] args) {
		
		int arr[];
		System.out.println("enter array limit");
		int limit=Utility.GetInt();              //getting the array limit
		arr=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter input of index "+i);
			arr[i]=Utility.GetInt();          //getting array input
			
		}
		System.out.println("Total distinct triplets are"+Utility.PrintIndexSum0(arr, limit));
		
		
		

	}

}
