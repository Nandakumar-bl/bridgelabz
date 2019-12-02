package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.datastructure.basic.Util;
import com.bridgelabz.utility.Utility;

public class StackPrimeAna {

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
	        String sop[]=s.split(" ");
	        int newarr[]=new int[sop.length];
	       for(int j=0;j<sop.length;j++)
	       {
	    	   newarr[j]=Integer.parseInt(sop[j]);
	    	   list.push(newarr[j]);
	       }
	       for(int i=0;i<newarr.length;i++)
	    	 System.out.println(list.pop());
	}

}
