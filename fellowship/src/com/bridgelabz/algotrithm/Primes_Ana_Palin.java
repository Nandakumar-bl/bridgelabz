package com.bridgelabz.algotrithm;

import com.bridgelabz.utility.utility;

public class Primes_Ana_Palin {

	public static void main(String[] args) {
		int min,max;
		System.out.println("Enter the min and max");
		min=utility.getInt();
		max=utility.getInt();
        
		String str=utility.print_primes(min,max);
        String arr[]=str.split(" ");
    
    for(int j=0;j<arr.length;j++)
    {
    	for(int k=0;k<arr.length;k++)
    	{
    		if(k==j)continue;
    		if(utility.check_anagram_int(arr[j],arr[k]))
    			System.out.println(arr[j]+" and "+arr[k]+" are anagrams");
    	}
    }
    for(int i=0;i<arr.length;i++)
    {
    	if(utility.check_palindrome(arr[i]))
    		System.out.println("the palindrome primes are"+arr[i]);
    }
    
    


	}

}
