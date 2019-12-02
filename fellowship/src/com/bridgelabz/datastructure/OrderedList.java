/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Ordered list program using linkedlist for integer
 * FileName -  OrderedList.java
 * Date     -  20/11/2019
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.basic.*;
import com.bridgelabz.utility.Utility;

public class OrderedList<E> {
	public static void main(String[] args) throws Exception {
		LinkedList<Integer> olist=new LinkedList<Integer>();
		String file;
		Integer find;
		System.out.println("Enter the file name");
		file=Utility.GetLine();
		
		String str[]=Utility.ReadFile(file).split(",");
		
		Integer[] arr=new Integer[str.length];
         for(int i=0;i<str.length;i++)
        	 arr[i]=Integer.parseInt(str[i]);
		
         System.out.println("Enter a number to find");
    	    find=Utility.GetInt();
    	    
    	    Utility.BubbleSort_G(arr);
    	 	
    	 for(int j=0;j<arr.length;j++)
    		 olist.insert(arr[j]);
     	
       	 if(olist.search(arr, find))
    		 olist.remove(find);
    	  else
			olist.insertAt(find,olist.orderIndex(find));
    	 
    	     olist.toFile();

	}

}
