package com.bridgelabz.functional;

import com.bridgelabz.utility.utility;

public class Sumof3_Index {
	
		public static void main(String[] args) {
		
		int arr[];
		System.out.println("enter array limit");
		int limit=utility.getInt();
		arr=new int[limit];
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter input oof index "+i);
			arr[i]=utility.getInt();
			
		}
		System.out.println("Total distinct triplets are"+utility.printindex_sum0(arr, limit));
		
		
		

	}

}
