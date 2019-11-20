package com.bridgelabz.functional;

////////////////////////program to calculate the eucledian distance///////
import com.bridgelabz.utility.utility;

public class Distance {
	
	public static void main(String[] args) 
	{
		System.out.println("enter x value");
		int x=utility.getInt();           //gets input
		System.out.println("Enter y value");
		int y=utility.getInt();           //gets input
		System.out.println("The Eucledian distance for("+x+","+y+") is:"+utility.find_Edistance(x,y));
		

	}

}
