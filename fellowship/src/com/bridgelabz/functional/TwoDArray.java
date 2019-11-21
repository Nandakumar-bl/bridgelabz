 /* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to get input and to print a two dimensional array.
 * FileName -  TwoDArray.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class TwoDArray
{
	
	public static void main(String args[])
	{
		int row,col;
		System.out.println("enter the number of rows and columns");
         row=Utility.GetInt();         //gets no of rows
         col=Utility.GetInt();        //gets no of columns
         System.out.println("enter 1 for integer and 2 for double and 3 for boolean");
         int choice=Utility.GetInt();
         
         switch(choice)
         {
         case 1:
        	 Utility.InputInt(row,col);
        	 break;
         case 2:
        	 Utility.InputDouble(row,col);
        	 break;
        case 3:
        	 Utility.InputBoolean(row,col);
        	 break;
         }
	
	}
}
	
	