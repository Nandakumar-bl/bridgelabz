package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class insertion_s {

	public static void main(String[] args){
		System.out.println("Enter the string limit");
		                                     //getting array limit
		int limit= utility.getInt();
		String arr[]=new String[limit];
		                                     //getting input for array
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the string for"+i+"th index");
			arr[i]=utility.getLine();                
		}
		utility.insertion_sort(arr);
		                       
		for(String s:arr)                   //prints sorted String
			System.out.println(s);

	}

}
