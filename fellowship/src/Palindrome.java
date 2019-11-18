


public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("enter 1 for int and 2 for string");
		int choice=utility.getInt();
		switch(choice)
		{
		case 1:
		      System.out.println("Enter any number to check palindrome");
		      int check_int=utility.getInt();
		      System.out.println(utility.check_palindrome(check_int));
		case 2:
		      System.out.println("Enter any word to check palindrome");
		      String check_str=utility.getLine();
		      System.out.println(utility.check_palindrome(check_str));	
		}

}
	
}