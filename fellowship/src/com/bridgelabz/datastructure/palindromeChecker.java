package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.basic.*;
import com.bridgelabz.utility.Utility;

public class palindromeChecker {

			static deque<Character> deque=new deque<Character>();

			public static  void insert(String word)
			{
				for(int i=0;i<word.length();i++)
				{
					deque.enqueue(word.charAt(i));
				}
				
			}
			public static void main(String[] args) {
				
				System.out.println("Enter a String to check whether");
				String word=Utility.GetLine();
				String removefront="";
				String removerear="";
				insert(word);
				for(int i=0;i<word.length();i++)
				{
					removefront=removefront+deque.removefront();	
				}
				insert(word);
				
				for(int i=0;i<word.length();i++)
				{
					removerear=removerear+deque.removerear();	
				}
				if(removerear.equals(removefront))
					System.out.println(word+" is a palindrome");
				else
					System.out.println(word+" is not a palindrome");
				
			}

	}

}
