/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Program to get an array from user to sort it using insertion sort algorithm
 * FileName -  InsertionSort.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args){
		System.out.println("Enter the string limit");
		                                     //getting array limit
		int limit= Utility.GetInt();
		String arr[]=new String[limit];
		                                     //getting input for array
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the string for"+i+"th index");
			arr[i]=Utility.GetLine();                
		}
		Utility.InsertionSort(arr);
		                       
		for(String s:arr)                   //prints sorted String
			System.out.println(s);

	}

}
