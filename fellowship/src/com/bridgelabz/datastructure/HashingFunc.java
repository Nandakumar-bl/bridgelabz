/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  Hashing function program using Linked List
 * FileName -  HashingFunc.java
 * Date     -  21/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.datastructure.basic.LinkedList.node;
import com.bridgelabz.datastructure.basic.Util;
import com.bridgelabz.utility.Utility;

public class HashingFunc {

	public static void main(String[] args) throws Exception {
		LinkedList<Integer>[] link=new LinkedList[11];
		for(int i=0;i<link.length;i++)
		{
			link[i]=new LinkedList<Integer>();
		}
		Integer find;
		System.out.println("Enter the filename to search");
		String file=Utility.GetLine();
		System.out.println("Enter the integer to find");
		find=Utility.GetInt();
		String s[]=Utility.ReadFile(file).split(",");
		Integer arr[]=new Integer[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i]=Integer.parseInt(s[i]);
		}
		String noduplicate[]=Util.GetArray(arr);
		Integer original[]=new Integer[noduplicate.length];
		for(int i=0;i<noduplicate.length;i++)
		{
			original[i]=Integer.parseInt(noduplicate[i]);
		}
		
		int rem;
		for(int j=0;j<original.length;j++)
		{
			rem=arr[j]%11;
			link[rem].insert(original[j]);
		}
		
		if(link[find%11].search(original,find))
		   link[find%11].remove(find);	
		else
		   link[find%11].insert(find);
		
		link[0].toFileHash(link);
	}

}
