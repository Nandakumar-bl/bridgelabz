/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program hols the static methods for datastructure program
 * FileName -  Util.java
 * Date     -  20/11/2019
 */
package com.bridgelabz.datastructure.basic;

import com.bridgelabz.utility.Utility;

public class Util{
	/**static function to print Number of binary search trees
	 * @param int []testcases
	 * @param max
	 */
	public static void BinarySearchTree(int[] testcases,int max)
	{
		long N[]=new long[max+1];
		N[0]=N[1]=1;
		for(int i=2;i<=max;i++)
		{
			N[i]=0;
			for(int j=0;j<i;j++)
				N[i]+=N[j]*N[i-j-1];
		}
		
		for(int i=0;i<testcases.length;i++)
			System.out.println(N[testcases[i]]%((long)Math.pow(10,8)+7));

	}
	
	/**static fuhnction to print calendar in two dimensional array
	 * @param int  date
	 * @param int month
	 * @param int year
	 *return void
	 */
	public static void PrintCalendar(int date,int month,int year)
	{
	System.out.println("java calendar "+date+" "+year);
	System.out.println(month+"  "+year);
	System.out.println("s  m  t  w  t  f  s");
	int day=Utility.DayOfWeek(date, month, year);
	String cal[][]=new String[5][7];
	int count=0,j=0,k=0;
	for(int p=0;p<day;p++)
	{
		cal[j][k++]="   ";
		count++;
	}
	for(int i=1;i<=31;i++)
	{
		if(i<10)
		    cal[j][k++]=i+"  ";
		else
			cal[j][k++]=i+" ";
		count++;
		if(count%7==0)
		{
			j++;
			k=0;
		}

		if(Utility.CheckLeap(year)&& month==2 && i == 29)
	    break;
		else if(month ==2 && i ==28)
		break;
		else if(month == 4 || month ==6 || month==9  ||month==11  && i==30) 
		break;
	}

	for(int i=0;i<5;i++)
	{
		for(int m=0;m<7;m++)
		{
			if(cal[i][m]!=null)
			System.out.print(cal[i][m]);
		}
		System.out.println();
		
	}
	
	}
	/**Static function to print two Dimensional array
	 * @param newarr
	 * @return void
	 */
	
	public static void PrintTwoDi(int newarr[])
	{
		 int twod[][]=new int[10][30];
	        int l=0;
	        for(int j=0;j<10;j++)
	        {
	        	for(int k=0;newarr[l]<100*(j+1);k++,l++)
	        	{
	        		twod[j][k]=newarr[l];
	        	      if(l==newarr.length-1)break;
	        	}
	        	if(l==newarr.length-1)break;
	        }
	        l=0;
	        for(int j=0;j<=10;j++)
	        {
	        	for(int k=0;newarr[l]<100*(j+1);k++,l++)
	        	{
	        		System.out.print(twod[j][k]+" ");
	        		if(l==newarr.length-1)break;
	        	}
	        	System.out.println();
	        	if(l==newarr.length-1)break;
	        	
	        }
		
	}
	
	/**satic function to get anagrams
	 * @param String  str
	 * @return s;
	 */
	public static String GetAnagram(String str[])
	{
		   String anagrams="";
	        String temp="";
	        
	       for(int j=0;j<str.length;j++)
	       {
	    	   for(int k=0;k<str.length;k++)
	    	   {
	    		   if(k==j)continue;
	    		   if(Utility.CheckAnagramInt(str[j],str[k]))
	    		   {
	    			   if(!temp.equals(str[j]))
	    			   {
	    			   anagrams=anagrams+str[j]+" ";
	    			   temp=str[j];
	    			   }
	    		   }
	    	    }
	       }
	return anagrams;
	}
	/**static program to get sorted array with different value
	 * @param Integer []str
	 * @return string[] array
	 */
	public static String[] GetArray(Integer str[])
	{
		   String s="";
	       int temp=0;
	       Utility.BubbleSort_G(str);
	        
	    	   for(int k=0;k<str.length;k++)
	    	   {
	    			   if(temp!=str[k])
	    			   {
	    			   s=s+str[k]+" ";
	    			   temp=str[k];
	    			   }
	    		   }
	    	  String array[]=s.split(" ");
	     return array;
	}


	}
