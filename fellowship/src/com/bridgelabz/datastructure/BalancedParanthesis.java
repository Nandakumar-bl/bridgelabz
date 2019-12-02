/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  porgram to find whether the given is balanced or not using stack.
 * FileName -  BalancedParanthesis.java
 * Date     -  23/11/2019
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.utility.Utility;

public class BalancedParanthesis {

	public static void main(String[] args) {
	  LinkedList<String> stack=new LinkedList<String>();
      String arith_exp;
      System.out.println("Enter the arithmatic expression u want to check");
      arith_exp=Utility.GetLine();
      char[] chararray=arith_exp.toCharArray();
      try{
      for(int i=0;i<chararray.length;i++)
      {
    	  if(chararray[i]=='(')
    		  stack.push("(");
    	  else if(chararray[i]==')')
    		  stack.pop();
      }
      if(stack.isEmpty())
    	  System.out.println("the equation is balanced");
      else
    	  System.out.println("the equation is not balanced");
      }
      catch(NullPointerException e)
      {
    	  System.out.println("the equation is not balanced");
      }
	
     

	}

}
