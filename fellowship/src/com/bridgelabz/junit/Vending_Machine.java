package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;

public class Vending_Machine {
      
	
	
	public static void main(String[] args) 
	{
		int amount,i=0;
		System.out.println("enter the amount u need to calculate");
		amount=utility.getInt();
		utility.print_notes(amount,i);
	}

}
