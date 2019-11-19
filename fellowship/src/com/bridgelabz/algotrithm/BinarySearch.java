package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class BinarySearch {

	
	public static void main(String[] args) 
	{
		String find,file;
		System.out.println("enter the file name");
		file=utility.getLine();                   //getting file name
		String arr[]=utility.readfile(file).split(" ");
		System.out.println("enter the word to find");   //getting the word to find
		find=utility.getLine();
		utility.insertion_sort(arr);    //sorting array using insertion sort
		for(String s:arr)
			System.out.println(s);
        utility.binarysearch(arr,find);  //finding the required word in sorted array

	}

}
