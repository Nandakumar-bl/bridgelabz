/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by 
 *             Vending Machine. Write a Program to calculate the minimum number of Notes as well as 
 *             the Notes to be returned by the Vending Machine as a Change.
 * FileName -  VendingMachine.java
 * Date     -  19/11/2019
 */package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;  //program to get minimum notes for the required amount

public class VendingMachine {
      
	
	
	public static void main(String[] args) 
	{
		int currency[]= {1000,500,100,50,20,10,5,2,1};
		int amount,i=0;
		System.out.println("enter the amount u need to calculate");
		amount=Utility.GetInt();
		int notes[]=Utility.PrintNotes(amount);
		
		for(int j=0;j<currency.length;j++)
		System.out.println("number of "+currency[i]+"'s are :"+notes[i]);
	}

}
