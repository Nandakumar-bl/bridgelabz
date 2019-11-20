package com.bridgelabz.functional;

import com.bridgelabz.utility.utility;
                                  //program to calculate the indexes of 3 in array gives sum 0
public class Sumof3_Index {
	
		public static void main(String[] args) {
		
		int arr[];
		System.out.println("enter array limit");
		int limit=utility.getInt();              //getting the array limit
		arr=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter input of index "+i);
			arr[i]=utility.getInt();          //getting array input
			
		}
		System.out.println("Total distinct triplets are"+utility.printindex_sum0(arr, limit));
		
		
		

	}

}
