/*Author: Nanda kumar.s
 *purpose:program to maintain a stock account.  
 * date:29.11.19
 * filename:StockManager.java
 */

package com.bridgelabz.stock.controller;
import com.bridgelabz.stock.Utility.Utility;
import com.bridgelabz.stock.serviceimp.StockAccountImp;

public class StockManager {

	public static void main(String[] args) throws Exception{

		StockAccountImp stockacc=new StockAccountImp();
		int runner=0;
		while(runner==0){
		System.out.println("--------------StockManager------------\n\n"
				                              +"\t 1.Creating account\n"
											  +"\t 2.open exsisting account\n"
											  +"\t 3.Add or remove company\n"
											  +"\t 4.Exit\n");
		switch(Utility.GetInt())
		{
		
		case 1:
			System.out.println("Enter the filename to store stock details");
			String filename=Utility.GetLine();
			stockacc.createaccount(filename);
			break;
			
		case 2:
			System.out.println("Enter the filename to change stock details");
			String fname=Utility.GetLine();
			stockacc.exsistingacc(fname);
			int end=0;
			while(end!=1){
			System.out.println("------------Enter an option-------------\n\n"
					                     +"\t 1.AddMoney to account\n"
					                     + "\t 2.buyshare\n"
					                     + "\t 3.sellshare\n"
					                     + "\t 4.printreport\n"
					                     + "\t 5.save your accounts\n"
					                     + "\t 6.Exit");
			  switch(Utility.GetInt())
			  {
			  case 1:
				  System.out.println("Enter the amount to add in your stock");
				  double amount=Utility.GetDouble(); 
				  stockacc.AddAmount(amount);
				  break;
				  
			  case 2:
				  System.out.println("Enter the Stock Symbol to buy");
				  String symbol=Utility.GetLine();
				  System.out.println("Enter the amount");
				  double amt=Utility.GetDouble();
				  stockacc.Buy(amt,symbol);
				  break;
				  
			  case 3:
				System.out.println("Enter the stock symbol to sell");
				String symbolsell=Utility.GetLine();
				System.out.println("Enter the amount");
				double amtsell=Utility.GetDouble();
				stockacc.Sell(amtsell,symbolsell);
				break;
				
			  case 4:
				  stockacc.PrintReport();
				  break;
			  
			  case 5:
				  stockacc.Save();
				  end=1;
				  break;
				  
			  case 6:
				  stockacc.Save();
				  System.out.println("Thank you!!!see you soon:) :) :)");
			      end=1;
				  break;
			      
			   default:
				   end=1;
				   System.out.println("Wrong choice :( :( :(_____account closed");
				   break;
			  }
			}
			runner=1;
			break;
		case 3:
			System.out.println("press 1 to add company and press 2 to remove company");
			int choice=Utility.GetInt();
			if(choice==1){
				stockacc.addcompany();
			}
			else if(choice==2)
			{
				stockacc.removecompany();
			}
			else{
				System.out.println("wrong choice....:( :( :(");
			}
			break;
			
		case 4:
			
			System.out.println("Thankyou:) :) :) see you soon.");
			runner=1;
			break;
			
	    default:
	    	System.out.println("Wrong choice:( :( :( _____Bye");
	    	runner=1;
		  }
			
		}
	}

	}

