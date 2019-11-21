/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to the prime numbers which are anagrams and prime numbers which are palindrome 
 *              as well
 * FileName -  PrimesAnaPalin.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PrimesAnaPalin {

	public static void main(String[] args) {
		int min,max;
		System.out.println("Enter the min and max");
		min=Utility.GetInt();    //getting min and max for checking prime
		max=Utility.GetInt();
        
		String str=Utility.PrintPrimes(min,max);
        String arr[]=str.split(" ");
    
    for(int j=0;j<arr.length;j++)
    {
    	for(int k=0;k<arr.length;k++)
    	{
    		if(k==j)continue;
    		if(Utility.CheckAnagramInt(arr[j],arr[k]))     //checking for anagrams in the prime numbers
    			System.out.println(arr[j]+" and "+arr[k]+" are anagrams");
    	}
    }
    for(int i=0;i<arr.length;i++)
    {
    	if(Utility.CheckPalindrome(arr[i]))           //finding the prime number which are also palindrome
    		System.out.println("the palindrome primes are"+arr[i]);
    }
    
    


	}

}
