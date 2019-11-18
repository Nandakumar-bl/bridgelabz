           //program for two dimensional array
package com.bridgelabz.functional;

import com.bridgelabz.utility.utility;

public class Twod_Array
{
	
	public static void main(String args[])
	{
		int row,col;
		System.out.println("enter the number of rows and columns");
         row=utility.getInt();         //gets no of rows
         col=utility.getInt();        //gets no of columns
         System.out.println("enter 1 for integer and 2 for double and 3 for boolean");
         int choice=utility.getInt();
         
         switch(choice)
         {
         case 1:
        	 utility.inputint(row,col);
        	 break;
         case 2:
        	 utility.inputdouble(row,col);
        	 break;
        case 3:
        	 utility.inputboolean(row,col);
        	 break;
         }
	
	}
}
	
	