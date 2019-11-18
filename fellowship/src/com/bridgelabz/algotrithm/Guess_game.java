package com.bridgelabz.algotrithm;
import com.bridgelabz.utility.utility;

public class Guess_game {

	public static void main(String[] args) {
		
		System.out.println("guess a no beween o to 127");
		utility.getInt();
		try
		{
			System.out.println("guessed no is"+utility.find());
		}
		catch(Exception e)
		{
			System.out.println("enter correct input");
		}

	}

}
