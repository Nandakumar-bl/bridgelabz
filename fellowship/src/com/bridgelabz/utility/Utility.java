package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

import com.bridgelabz.algorithm.UserDetails;

public class Utility {
	  static PrintWriter pw=new PrintWriter(System.out,true);
      static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
      static Scanner sc=new Scanner(System.in);
      
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
  /* static function to replace the string message with username
   * @param -String s
   * @Return-String original
   */
  public static String StrReplace(String s) //string replace
    {
    	String Default="Hi username,how are you";
    	String original=Default.replaceAll("username",s);
    	return (original);
	    	
	    	
    }
  /* static function to print percentage of heads and tails for the number of flips
   * @param -int flips
   * @Return-void
   */
  public static void FlipCoin(int flips)
    {
    	int heads_c=0,tails_c=0;
    	int  t_percent,h_percent;
        for(int i=0;i<flips;i++)
        {
        	if(Math.random()<0.5)
        		heads_c++;
        	else
        		tails_c++;
        }
        t_percent=(tails_c*100)/flips;
        h_percent=(heads_c*100)/flips;
        System.out.println("Tails percent is:"+t_percent);
        System.out.println("Head percent is:"+h_percent);
    }
  /* static function to check leap year
   * @param -int year
   * @Return-boolean
   */
  public static boolean CheckLeap(int year)
    {
	  while(year!=0)
	  {
		  if(year>999 && year <10000)
		  {
			  
    	    if((year%100!=0) && (year%400==0) || (year%4==0))
    		return true;
	    	else
    		 return false;
		  }
		  else
		  {
			  System.out.println("enter a valid year");
			  year=GetInt();
		  }
		  
	  }
	  return false;
    }
	    
  /* static function to print power of 2
   * @param -int n
   * @Return-void
   */
  public static void PowerOf2(int n)
    {
    	for(int i=0;i<=n;i++)
    	{
    		System.out.println("2 power of "+i+"is" +(int)Math.pow(2, i));
    	}
    }
    
  
  /* static function to print the harmonic value
   * @param -int n
   * @Return-void
   */
  public static void HarmonicNum(int n)
    {
    	float ans=0;
    	for(float i=1;i<=n;i++)
    	{
    		ans=ans+(1/i);
    	}
    	System.out.println("Harmonic number of "+n+":"+ans);
	    	
    }
  
  /* static function to print the prime factors
   * @param -int n
   * @Return-void 
   *    */
  public static void PrimeFact(int n)
  {
	  int factor;
	  for(factor=2;factor<=n*n;factor++)
	  {
		  while(n%factor==0)
		  {
			  System.out.println("factor is"+factor);
		      n/=factor;

		  }
	  }
	  if(n>1)
		  System.out.println("factor is"+factor);
	  
  }
  /* static function to get two dimensional array input for integer and to print array
   * @param -int row,int col
   * @Return-void
   */
  public static void InputInt(int row,int col)
	{
      Integer arr[][]=new Integer[row][col];
      for(int i=0;i<row;i++)
      {
      	for(int j=0;j<col;j++)
      	{
      		 System.out.println("enter int value of row:"+i+"col:"+j);
                arr[i][j]=GetInt();
      	}
      }
	    Printarray(arr,row,col);
	}

  /* static function to get two dimensional array input for double and to print array
   * @param -int row,int col
   * @Return-void
   */
	public static void InputDouble(int row,int col)
	{
      Double arr[][]=new Double[row][col];
      for(int i=0;i<row;i++)
      {
      	for(int j=0;j<col;j++)
      	{
      		 System.out.println("enter int value of row:"+i+"col:"+j);
                arr[i][j]=sc.nextDouble();
      	}
      }
	    Printarray(arr,row,col);
	}
	/* static function to get two dimensional array input for boolean and to print array
	   * @param -int row,int col
	   * @Return-void
	   */
	public static void InputBoolean(int row,int col)
	{
      Boolean arr[][]=new Boolean[row][col];
      for(int i=0;i<row;i++)
      {
      	for(int j=0;j<col;j++)
      	{
      		 System.out.println("enter int value of row:"+i+"col:"+j);
                arr[i][j]=sc.nextBoolean();
      	}
      }
	    Printarray(arr,row,col);
	}
	/* static generic  function to print two dimensional array
	   * @param -t arr[][],int row,int col
	   * @Return-void
	   */
	public static <t> void Printarray(t arr[][],int row,int col)
	{
		for(int i=0;i<row;i++)
      {
      	for(int j=0;j<col;j++)
      	{
      		 pw.printf("%s",arr[i][j]);
      	}
      	pw.println();
      }
	}

	/* static function to print  three indexes of an array which gives sum zero
	   * @param -int[] arr,int limit
	   * @Return-int count
	   */
	public static int PrintIndexSum0(int[] arr,int limit)
	{
		int count=0;
		for(int i=0;i<limit;i++)
		{

			for(int j=0;j<limit;j++)
			{ if(j==i)              //to prevent getting same indexes
				continue;

				for(int k=0;k<limit;k++)
				{
					if(k==j || k==i) 
						continue;
				
				if(arr[i]+arr[j]+arr[k]==0)
				{	System.out.println("index is"+i+"-"+j+"-"+k);  //print indexes of array 
					count++;                                       //which gives sum zero  
				}
				}
			}
		}
		if(count==0)
	    System.out.println("no zero sum has occured");
		
		return count;
	}

	/* static function to find eucledian distance
	   * @param -int x,int y
	   * @Return-return Math.sqrt(x*x+y*y);
	   */
	
	public static double FindEdistance(int x, int y)
	{
		return Math.sqrt(x*x+y*y);  //formula for eucledian diastance
	}
	
	/* static function to print roots of a quadratic equation
	   * @param -int a,int b,int c
	   * @Return-void
	   */
	
	public static void FindRoots(int a,int b,int c)
	{
		// calculating delta value

				int delta = Math.abs(b * b - 4 * a * c);

				double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);

				double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);

				System.out.println(x1);

				System.out.println(x2);
	}
	
	/* static function to print wind chill
	   * @param -int t,int v
	   * @Return-void
	   */
	
	public static void FindWindchill(int t,int v)
	{
		double wind_temp;
		                          //formula to find windchill     
		wind_temp=35.74+(0.62515*t)+(0.4275*t-35.75)*Math.pow(v,0.16);
		
		System.out.println("windchill is:"+wind_temp);   //prints wind chill
	}

	/* static function play gambling
	   * @param -int Stake,int Goal,int noOfTimes
	   * @Return-void
	   */
	
	public static void Gambling(int Stake,int Goal,int noOfTimes)
	{


		int bets = 0;        // total number of bets made

		int wins = 0;        // total number of games won



		// repeat number of times

		for (int i=0; i< noOfTimes; i++) 

		{

			int cash = Stake;

	            

			while (cash > 0 && cash < Goal)

			{

				bets++;

	        

				if (Math.random() < 0.5) 

					cash++;     // win $1

				else                     

					cash--;     // lose $1

			}

	            if (cash == Goal) 

	            	wins++;                // to find no. of wins   

		}



		// print results

		System.out.println();

		System.out.println(wins + " wins of " + noOfTimes);

		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);

		System.out.println("Avg # bets           = " + 1.0 * bets / noOfTimes);


	}
	
	/* static function to generate coupon
	   * @param -no_of_coupons
	   * @Return-void
	   */
	public static void CouponGeneration(int no_of_coupons)
	{
		String s="abcdefghijklmnopqrstuvwyz1234567890";
		for(int i=0;i<no_of_coupons;i++)
		{
			int count=0;
			String coupon="";
			while(count!=4)
			{
				int index=(int)(Math.random()*35+1);
				coupon=coupon+s.charAt(index);
                count++;			
			}
			System.out.println(coupon);
		}
	}
	
	/* static function to find  monthly payment
	   * @param -double prin,double i_rate,double year
	   * @Return-double m_payment;
	   */
	public static double MonthlyPayment(double prin,double i_rate,double year)
	{
		double m_payment;
		double rate=i_rate/(12*100);
		m_payment=(prin*rate)/(1-(float)Math.pow((1+rate),(-12*year)));
		return m_payment;
		
	}
	
	/* static function to find day of the week
	   * @param -int date,int month,int year
	   * @Return-int d0
	   */
	public static int DayOfWeek(int date,int month,int year)
	{
		int y0,m0,x,d0;                 //finding the day of particular date using georgian calender
		y0=year-(14-month)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=month+12*((14-month)/12)-2;     
		d0=(date+x+31*m0/12)%7;
	
	    return d0;
	}
  
	/* static function to print minimum notes for given amount
	   * @param -int amt
	   * @Return-int[] notes
	   */
	public static int[] PrintNotes(int amt)
	{
		int currency[]= {1000,500,100,50,20,10,5,2,1};
		int notes[]=new int[9];
		for(int i=0;amt!=0;i++)
		{
		if(amt%currency[i]==0)
		{
			notes[i]=amt/currency[i];     
			amt=0;
		}
		else
		{
			notes[i]=amt/currency[i];       //assinging number of notes
			amt=amt-currency[i]*notes[i];   //calculating the remaining money
			
		}
		}
		return notes;
		
	}
	/* static functions to start stopwatcht
	   * @param ------
	   * @Return-long
	   */
	public static long StartTicking()
	{
		System.out.println("press 1 to start time");
		sc.nextInt();
		long start=System.currentTimeMillis();
		System.out.println(start);
		return start;
	}
	/* static function to stop the stopwatch
	   * @param ---
	   * @Return-long stop
	   */
	public static long StopTicking()
	{
		System.out.println("press 2 to stop time");
		sc.nextInt();
		long stop=System.currentTimeMillis();
		System.out.println(stop);	
		return stop;
	}
	/* static function to finf elapse time for stopwatch
	   * @param -null
	   * @Return-long elapsedtime
	   */
	public static long ElapsedTime()
	{
		long elapsedtime=(StartTicking()-StopTicking())/1000;
		return elapsedtime;
	}
	
	/* static function to print and conversion from 'C to'F and vice-versa
	   * @param -int temp,int choice
	   * @Return-int temp
	   */
	public static int TemperatureConversion(int temp,int choice)
	{
		switch(choice)
		{
		case 1:
			int celsius=temp;
			temp=(temp*9/5)+32;
			System.out.println("converted from celsius->"+celsius+"'C to farenheit->"+temp+"'F");
			return temp;
		
		case 2:
			int farenheit=temp;               
			temp=(temp-32)*5/9;                   
			System.out.println("converted from farenheit->" +farenheit+"'F to celsius "+temp+"'C");
			return temp;
		}	
		return 0;
	}

	/* static function to find sqrt using newton method
	   * @param -double c
	   * @Return-double t
	   */
	public static double Sqrt(double c)
	{
		double t,epsilon;                 //finding sqrt through newton method
		t=c;                                           
		epsilon=Math.exp(-15);                //epsilon calculation
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2;	
		}
  
      return t;
      
	}
	/* static function to covert decimal to binary
	   * @param -int dec
	   * @Return-string binary
	   */
	public static String ConvertToBinary(int dec)
	{
		String binary="";
		while(dec!=0)
		{
			int temp=dec%2;        //converting to binary
			binary=temp+binary;
			dec=dec/2;
		}
	return binary;
	}
	

	/* static function to covert decimal to binary and print the return decimal after swapping nibbles
	   * @param -int dec
	   * @Return-string binary
	   */
	public static int ConvertToBinSwap(int dec)
	{
		String binary="";
		while(dec!=0)
		{
			int temp=dec%2;
			binary=temp+binary;        //converting to binary value
			dec=dec/2;
		}
		return SwapNibbles(binary);
	}
	public static int  SwapNibbles(String str)
	{
		String swapped="";
		if((str.length()%2)!=0)
		{
			str=str+'0';
		}
		for(int i=(str.length()/2);i<str.length();)
		{
			swapped=swapped+str.charAt(i);  //swapping the binary value
			i++;
			if(i==(str.length()/2))break;
			if(i==(str.length()-1))
				{
				swapped=swapped+str.charAt(i);
				i=0;
				}
		}
		return ConvertToDec(swapped);
	}
	public static int ConvertToDec(String str)
	{
		int dec=0,len=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			dec+=(str.charAt(i)-48)*Math.pow(2,len-i);  //calculating decimal value 
		}                                               //of swapped nibble    
		
		return dec;
	}
	

	/* static function for bubble sort of integer
	   * @param -int arr[]
	   * @Return-int []arr
	   */
	public static int[] BubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr;
	}
	
	/* static function of bubble sort using generics
	   * @param -T arr[]
	   * @Return-T[] arr
	   */
	public static <T extends Comparable<T>> T[] BubbleSort_G(T[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					T temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr;
	}

	
	/* static function for insertion sort for string
	   * @param -int arr[]
	   * @Return-int []arr
	   */
	public static String[] InsertionSort(String arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			String temp=arr[i];
			while(j>=0 && (arr[j].compareTo(temp)>0))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		return arr;
	}
	
	/* static function for insertion sort using generics
	   * @param -T arr[]
	   * @Return-T []arr
	   */
	public static <T extends Comparable<T>> T[] InsertionSortGenerics(T arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			T temp=arr[i];
			while(j>=0 && (arr[j].compareTo(temp)>0))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		return arr;
	}
	/* static function for array input
	   * @param -String[] arr,int limit
	   * @Return-String []arr
	   */
	public static String[] arrayinput_str(String[] arr,int limit)
	{
		for(int i=0;i<limit;i++) 
		{
			System.out.println("Enter the word at index: "+i);
			arr[i]=Utility.GetLine();
		}
		return arr;
	}
	
  
	/* static function for checking anagram for two string
	   * @param -String word1,String word2
	   * @Return-boolean
	   */
	public static boolean CheckAnagram(String word1,String word2)
	{
		word1.toLowerCase();
		word2.toLowerCase();
		int arr1[]=new int[25];
		int arr2[]=new int[25];
		if(word1.length()!=word2.length())
			return false;
		for(int i=0;i<word1.length();i++)
		{
			arr1[word1.charAt(i)-97]++;
		}
		for(int i=0;i<word1.length();i++)
		{
			arr2[word2.charAt(i)-97]++;
		}
		for(int j=0;j<25;j++)
		{
			if(arr1[j]!=arr2[j])
				return false;
		}
		return true;
	}
	
	/* static function for checking anagram for two integer
	   * @param -String word1,String word2
	   * @Return-boolean
	   */
	public static boolean CheckAnagramInt(String word1,String word2)
	{
		int arr1[]=new int[10];
		int arr2[]=new int[10];                   //checking anagram for integer
		if(word1.length()!=word2.length())
			return false;                            
		for(int i=0;i<word1.length();i++)
		{
			arr1[word1.charAt(i)-48]++;
		}
		for(int i=0;i<word1.length();i++)
		{
			arr2[word2.charAt(i)-48]++;
		}
		for(int j=0;j<10;j++)
		{
			if(arr1[j]!=arr2[j])
				return false;
		}
		return true;
	}
	
	
	/* static function for printing prime number in given range
	   * @param -int min,int max
	   * @Return-string str
	   */
	public static String PrintPrimes(int min,int max) 
	{
		String str="";
		for(int i=min;i<max;i++)
		{
			int j=2;
			while(i!=j) 
			{
				if(i%j==0) 
					break;
				else
					j++;
			}
			if(j==i)
			{
				System.out.println(i+" is a prime number");
				str=str+i+" ";         //string is used for finding paindrome and anagram
			}
			}
		return str;
	}
	
	
	/* static function for checking palindrome using generics
	   * @param -t data
	   * @Return-boolean
	   */
	public static <t> boolean CheckPalindrome(t data)
    {
    	String temp=data.toString();
    	for(int i=0;i<temp.length();i++)
    	{
    		if(temp.charAt(i)!=temp.charAt(temp.length()-1-i))
    			return false;
    	}
    	return true;
    	
    }
	
	/* static function for reading file
	   * @param -string file
	   * @Return-string str
	   */
	@SuppressWarnings("deprecation")
	public static String ReadFile(String file)
	{
		String str="";
		try
		{
		FileInputStream fir=new FileInputStream(file);
	    DataInputStream dis=new DataInputStream(fir);
	    str=dis.readLine();
	    System.out.println(str);
	    dis.close();
	    fir.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
	    }
		return str;
		
	}
	/* static function for binary search of string
	   * @param -String[] Sorted_arr,String find
	   * @Return-void
	   */
	public static  void BinarySearch(String[] Sorted_arr,String find)
	{
		int mid=0;
		int low=0;
		int high=Sorted_arr.length-1;
		while(high>=low) 
		{
			mid=(low+high)/2;
			
			if(Sorted_arr[mid].equals(find))
			{
				System.out.println("the word->"+find+" is found");
			break;
			}
			else if(Sorted_arr[mid].compareTo(find)<0)
			{
				low=mid+1;
			}
			else if(Sorted_arr[mid].compareTo(find)>0)
				high=mid-1;
		}
		if(high<low)
			System.out.println("the word->"+find+" is not found");
		
	}


	/* static function for binary search using generics
	   * @param -t[] Sorted_arr,t find
	   * @Return-void
	   */
public static <t extends Comparable<t>>  void BinarySearchGenerics(t[] Sorted_arr,t find)
{
	int mid=0;
	int low=0;
	int high=Sorted_arr.length-1;
	while(high>low) 
	{
		mid=(low+high)/2;
		
		if(Sorted_arr[mid]==(find))
		{
			System.out.println("the search for->"+find+" is found");
		break;
		}
		else if(Sorted_arr[mid].compareTo(find)<0)
		{
			low=mid+1;
		}
		else if(Sorted_arr[mid].compareTo(find)>0)
			high=mid-1;
	}
	if(high<=low)
		System.out.println("the search for->"+find+" is not found");
	
}


/* static function for merge sort
 * @param -String arr[], int l, int m, int r
 * @Return-void
 */
public static void Merge(String arr[], int l, int m, int r) 
{ 
    // Find sizes of two subarrays to be merged 
    int n1 = m - l + 1; 
    int n2 = r - m; 

    /* Create temp arrays */
    String L[] = new String[n1]; 
    String R[] = new String[n2]; 

    /*Copy data to temp arrays*/
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 



    // Initial indexes of first and second subarrays 
    int i = 0, j = 0; 

    // Initial index of merged subarry array 
    int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i].compareTo(R[j])<0) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    /* Copy remaining elements of L[] if any */
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

    /* Copy remaining elements of R[] if any */
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 

public static void Sort(String arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        // Find the middle point 
        int m = (l+r)/2; 

        // Sort first and second halves 
        Sort(arr, l, m); 
        Sort(arr , m+1, r); 

        // Merge the sorted halves 
        Merge(arr, l, m, r); 
    } 
}

/* static function for getting date
 * @param -Date date
 * @Return-	return sdf.format(date)
 */
public static String GetFormatedDate(Date date){
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	return sdf.format(date);
}



/* static function for replacing the default message with user details using regex
 * @param -UserDetails userDetails,String message
 * @Return-	return msg
 */

public static String ConvertString(UserDetails userDetails,String message){
	String REGEX_NAME="<<name>>";
	String REGEX_FULLNAME="<<fullname>>";
	String REGEX_MOBILE_NO="xxxxxxxxxx";
	String REGEX_DATE="xx/xx/xxxx";
	
	Pattern p = Pattern.compile(REGEX_NAME);
   	Matcher m = p.matcher(message); 
   	message = m.replaceAll(userDetails.getfName());

	p = Pattern.compile(REGEX_FULLNAME);
	m = p.matcher(message); 
	message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

	p = Pattern.compile(REGEX_MOBILE_NO);
	m = p.matcher(message); 
	message = m.replaceAll(userDetails.mobileNo());

	p = Pattern.compile(REGEX_DATE);
	m = p.matcher(message); 
	message = m.replaceAll(userDetails.date());

	return message;
}

/* static function for guess game
 * @param -null
 * @Return-	return low
 */
public static int Find()
{
	int low=0,high=127,mid;
	while(low!=high)
	{
		mid=(low+high)/2;
		System.out.println("enter 1 if number is between"+low+"-"+mid+"/n enter 2 if  no is between"+(mid+1)+"-" +high);
		int c=Utility.GetInt();
		if(c==1)
			high=mid;
		else
			low=mid+1;
	}
	return low;
}

}

