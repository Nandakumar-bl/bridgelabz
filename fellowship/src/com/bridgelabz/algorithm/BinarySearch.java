/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to check whether the given word is found in the file using Binary Search
 * FileName -  BinarySearch.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinarySearch {

	
	public static void main(String[] args) 
	{
		String find,file;
		System.out.println("enter the file name");
		file=Utility.GetLine();                   //getting file name
		String arr[]=Utility.ReadFile(file).split(" ");
		System.out.println("enter the word to find");   //getting the word to find
		find=Utility.GetLine();
		Utility.InsertionSort(arr);    //sorting array using insertion sort
		for(String s:arr)
			System.out.println(s);
        Utility.BinarySearch(arr,find);  //finding the required word in sorted array

	}

}
