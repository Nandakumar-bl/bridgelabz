/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to check whether the given two Strings  are anagram or not
 * FileName -  Anagram.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class Anagram {


	public static void main(String[] args) {
		String word1="";
		String word2="";
		System.out.println("Enter the first word to check anagram:");
		word1=Utility.GetLine();
		System.out.println("Enter the second word to check anagram:");
		word2=Utility.GetLine();
		                             //checks the whether the words are anagram or not
		     if(Utility.CheckAnagram(word1,word2))
			   System.out.println("the given words "+word1+" and "+word2+" are anagrams");
		     else
			    System.out.println("the given words "+word1+" and "+word2+" are not anagrams");
	
	}

}
