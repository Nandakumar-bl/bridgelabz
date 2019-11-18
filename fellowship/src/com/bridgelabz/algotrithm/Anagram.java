package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class Anagram {


	public static void main(String[] args) {
		String word1="";
		String word2="";
		System.out.println("Enter the first word to check anagram:");
		word1=utility.getLine();
		System.out.println("Enter the second word to check anagram:");
		word2=utility.getLine();
		                             //checks the whether the words are anagram or not
		     if(utility.check_anagram(word1,word2))
			   System.out.println("the given words "+word1+" and "+word2+" are anagrams");
		     else
			    System.out.println("the given words "+word1+" and "+word2+" are not anagrams");
	
	}

}
