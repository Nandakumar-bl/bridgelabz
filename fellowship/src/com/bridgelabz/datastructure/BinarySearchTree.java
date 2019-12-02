/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to print the number of binary search trees can be formed with the given nodes.
 * FileName -  BinarySearchTree.java
 * Date     -  24/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.datastructure.basic.Util;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		int nooftestcases,max=0;
		System.out.println("Enter the number of testcase");
		nooftestcases=Utility.GetInt();
		int[] n=new int[nooftestcases];
		for(int i=1;i<=n.length;i++)
		{
			System.out.println("Enter the "+i+" testcase");
			n[i-1]=Utility.GetInt();
			if(n[i-1]>max)
				max=n[i-1];
		}

		Util.BinarySearchTree(n,max);
	
	}

}
