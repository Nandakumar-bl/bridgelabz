package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;

public class ToBinary {       //decimal to binary program

	
	public static void main(String[] args) {
		int decimal;
		
		System.out.println("enter a number to convert to binary");
		decimal=utility.getInt();    //getting a number to convert to binary;
		utility.convert_to_binary(decimal);
		
	}

}
