package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class Merge_sort 
{

public static void main(String[] srgs)
{
	String[] arr;
	System.out.println("Enter the String limit");
	int limit=utility.getInt();
	arr=new String[limit];
	
	for(int i=0;i<limit;i++)
	{
		System.out.println("enter the String for index :"+i);
		arr[i]=utility.getLine();
	} 
	utility.sort(arr,0,limit-1);
	 
	for(String temp:arr)
		  System.out.println(temp);
}
 
}
