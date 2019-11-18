package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class Prime_Numbers {
	
	public static void main(String[] args) {
		int max,min;
		System.out.println("Enter the maximum value");
		max=utility.getInt();
		System.out.println("Enter the minimum value");
		min=utility.getInt();
		        //prints prime between the range
		utility.print_primes(min, max);
		

	}

}
