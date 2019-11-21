/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to get String array as input and sorting it using Merge sort algorihtm
 * FileName -  MergeSort.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSort 
{

public static void main(String[] srgs)
{
	String[] arr;
	System.out.println("Enter the String limit");
	int limit=Utility.GetInt();                       //getting array limit
	arr=new String[limit];
	
	for(int i=0;i<limit;i++)
	{
		System.out.println("enter the String for index :"+i);
		arr[i]=Utility.GetLine();                               //getting array input
	} 
	Utility.Sort(arr,0,limit-1);                           //sorting array using merge sort algorithm
	 
	for(String temp:arr)
		  System.out.println(temp);    //printing sorted array
}
 
}
