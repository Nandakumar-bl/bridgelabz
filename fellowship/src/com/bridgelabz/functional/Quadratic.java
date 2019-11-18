package com.bridgelabz.functional;

import com.bridgelabz.utility.utility;

//program to find roots of quadratic equation

public class Quadratic {

		public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter a");
	     a=utility.getInt();
	     System.out.println("enter b");
	     b=utility.getInt();
	     System.out.println("enter c");
		c=utility.getInt();

		utility.find_roots(a,b,c);
		
		

	}

}
