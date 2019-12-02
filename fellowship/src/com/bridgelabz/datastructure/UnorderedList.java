/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  unorderd list program for string using linkedlist.
 * FileName -  UnorderedList.java
 * Date     -  20/11/2019
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.basic.*;
import com.bridgelabz.utility.Utility;
public class UnorderedList<E> {
			public static void main(String[] args) throws Exception
	{
		LinkedList<String> link=new LinkedList<String>();
		String file;
		String find;
		System.out.println("Enter the file name");
		file=Utility.GetLine();
		System.out.println("Enter a word to find");
    	find=Utility.GetLine();
		String str[]=Utility.ReadFile(file).split(",");
		
		for(int i=0;i<str.length;i++)
			link.insert(str[i]);
		
    	 if(link.search(str, find))
		 	 link.remove(find);
    	  else
			link.insert(find);
	    
    	 link.toFile();   

	}
		

}
