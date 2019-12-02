/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Program to print the month of a year using queue
 * FileName -  QueuePrimeAna.java
 * Date     -  20/11/2019
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.datastructure.basic.Util;
import com.bridgelabz.utility.Utility;

public class QueuePrimeAna {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>(); 
		int max,min;
		System.out.println("Enter the maximum value");
		max=Utility.GetInt();
		System.out.println("Enter the minimum value");
		min=Utility.GetInt();
		        //prints prime between the range
		 String str[]=Utility.PrintPrimes(min, max).split(" ");
	       
	        String s=Util.GetAnagram(str);
	        String anagrams[]=s.split(" ");
	        int newarr[]=new int[anagrams.length];
	       for(int j=0;j<anagrams.length;j++)
	       {
	    	   newarr[j]=Integer.parseInt(anagrams[j]);
	    	   list.enqueue(newarr[j]);
	       }
	       int lsize=list.size();
	       for(int i=0;i<lsize;i++)
	    	 System.out.println(list.dequeue());
	    	 

	}

}
