package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class BubbleSort {

	public static void main(String srgs[]) {
		System.out.println("enter array limit");
		int limit=utility.getInt();         //getting limit for array
		int arr[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the value of"+i+"th index");
			arr[i]=utility.getInt();
		}
		utility.bubblesort(arr);          //sorting array using bubble sort
		for(int i:arr)
			System.out.println(i);  //printing the sorted array
		}

}
