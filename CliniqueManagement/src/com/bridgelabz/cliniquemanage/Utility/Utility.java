package com.bridgelabz.cliniquemanage.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Utility {
	  static PrintWriter pw=new PrintWriter(System.out,true);
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

    
public static int GetInt()
{
	  try
	  {
	  return Integer.parseInt(br.readLine());
	  }
	  catch(Exception e) {
	    System.out.println(e);
	  }
	  return 0;
}

public static String GetLine()
{
	  try {
	      
		  return br.readLine();
	  }
	  catch(Exception e) {
	    System.out.println(e);
	  }
	  return "";
}

public static double GetDouble()
{
	  try {
	        return Double.parseDouble(br.readLine());
	  }
	  catch(Exception e) {
	    System.out.println(e);
	  }
	  return 0.0;
}
public static long Getlong()
{
	  try {
	        return Long.parseLong(br.readLine());
	  }
	  catch(Exception e) {
	    System.out.println(e);
	  }
	  return 0;
}
}
