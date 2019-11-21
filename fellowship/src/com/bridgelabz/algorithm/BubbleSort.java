/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to sort and print the given array using the Bubble sort algorithm
 * FileName -  BubbleSort.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class BubbleSort {

	public static void main(String srgs[]) {
		System.out.println("enter array limit");
		int limit=Utility.GetInt();         //getting limit for array
		int arr[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the value of"+i+"th index");
			arr[i]=Utility.GetInt();
		}
		Utility.BubbleSort(arr);          //sorting array using bubble sort
		for(int i:arr)
			System.out.println(i);  //printing the sorted array
		}

}
