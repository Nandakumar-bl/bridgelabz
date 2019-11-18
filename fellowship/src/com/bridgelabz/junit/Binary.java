package com.bridgelabz.junit;

import com.bridgelabz.utility.utility;

public class Binary {

	public static void main(String[] args) {
		int decimal;
		System.out.println("enter a number to convert to binary and to swap nibbles");
		decimal=utility.getInt();    //getting a number to convert to binary and to swpnibbles;
		utility.convertto_bin_swap(decimal);

	}

}
