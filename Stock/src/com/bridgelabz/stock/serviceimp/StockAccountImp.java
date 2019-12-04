/*Author: Nanda kumar.s
 *purpose:implementation for stock account management.  
 * date:29.11.19
 * filename:StockAccountImp.java
 */

package com.bridgelabz.stock.serviceimp;

import java.io.File;  
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.stock.Utility.LinkedList;
import com.bridgelabz.stock.Utility.Utility;
import com.bridgelabz.stock.model.Company;
import com.bridgelabz.stock.model.Stock;
import com.bridgelabz.stock.model.Transaction;
import com.bridgelabz.stock.service.StockAccount;



public class StockAccountImp implements StockAccount
{
	Stock stockObject=new Stock();
	Company company=new Company();
	Transaction transaction=new Transaction();
	LinkedList List=new LinkedList();
	LinkedList queue=new LinkedList();
	LinkedList stack=new LinkedList();
	JSONParser parser=new JSONParser();
	JSONObject stock;
    String filename;
	JSONArray array;
	JSONArray trans;
	double amountbalance;
	public StockAccountImp() throws Exception
	{
	String value=parser.parse(new FileReader("Company.json")).toString();
	array=new JSONArray(value);
	String transac=parser.parse(new FileReader("Transaction.json")).toString();
	trans=new JSONArray(transac);
	
	for(int i=0;i<array.length();i++)
		List.insert(array.getJSONObject(i));
	}
	public void createaccount(String filename) throws Exception
	{
		this.filename=filename;
        stock=new JSONObject();
        stockObject.setName(filename);
		System.out.println("Add the initial amount in your stock account");
		stockObject.setAmountbalance(Utility.GetDouble());
		stock.put("amount",stockObject.getAmountbalance());
		stock.put("name",stockObject.getName());
		Save();
		
	}
	
	public void exsistingacc(String filename) throws Exception
	{
		this.filename=filename;
		String js=parser.parse(new FileReader(filename+".json")).toString();
		stock=new JSONObject(js);
		stockObject.setName(filename);
		stockObject.setAmountbalance(stock.getDouble("amount"));
		amountbalance=stockObject.getAmountbalance();
		
	}
	
	public void setStock(String symbol,int share)
	{
		stockObject.setshare(share);
		stockObject.setSymbol(symbol);
	}
	public void setcompany(JSONObject js) throws Exception
	{
		company.setName(js.get("name").toString());
		company.setStocksymbol(js.get("symbol").toString());
		company.setpricepershare(js.getDouble("pricepershare"));
		company.setShares(js.getInt("shares"));
	}
	public void AddAmount(double amount) 
	{
		System.out.println("");
		try {
			stockObject.setAmountbalance(stockObject.getAmountbalance()+amount);
			stock.put("amount",(stockObject.getAmountbalance()));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	double valueof() throws Exception
	{
		return stockObject.getAmountbalance();
	}
	
	public void Sell(double amount,String symbol)
	{
		try{
		int count=0;
		if(checkstock(symbol)){
		for(int i=0;i<array.length();i++)
		{
			JSONObject object=(JSONObject)array.getJSONObject(i);
			if(object.get("symbol").equals(symbol))
			{
				setcompany(object);
				setStock(symbol,stock.getInt(symbol));
				count++;
				if(amount>=company.getpricepershare()){
					int share=(int)(amount/company.getpricepershare());
					amountbalance+=(double)share*company.getpricepershare();
					if(stockObject.getshare()>=share)
					{
				    stockObject.setshare(stockObject.getshare()+share);
				    company.setShares(company.getShares()+share);
					queue.enqueue(new Date());
					stack.push(stockObject.getSymbol());
					stock.put("name",stockObject.getName());
					stock.put(stockObject.getSymbol(),stockObject.getshare());
					stock.put("amount",amountbalance);
					object.put("shares",company.getShares());
					setTransaction(object,"sell");
					}
					else{System.out.println("you dont have enough shares");}
				}
				else
				{
					System.out.println("your amount is too low");
				}
		    }
			if(count==0)
				System.out.println("No companies available for this share");
		}
	}
		else{
			System.out.println("You dont have the stock in your account please buy first");
		}
		
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	public void setTransaction(JSONObject object,String sellbuy) throws Exception
	{
		JSONObject tr=new JSONObject();
		transaction.setBuySell(sellbuy);
		tr.put("bull or sell",transaction.getBuySell());
		transaction.setDate(queue.dequeue().toString());
		tr.put("date",transaction.getDate());
		transaction.setName(filename);
		tr.put("name",transaction.getName());
		transaction.setSymbol(stack.pop().toString());
		tr.put("symbol", transaction.getSymbol());
		trans.put(tr);
	}
	public void Buy(double amount,String symbol)
	{
		try{
		int count=0;
		for(int i=0;i<array.length();i++)
		{
			JSONObject object=(JSONObject)array.getJSONObject(i);
			if(object.get("symbol").equals(symbol))
			{
				setcompany(object);
				try{
				setStock(symbol,(int)stock.get(symbol));
				}
				catch(Exception e)
				{
					setStock(symbol,0);
				}
				count++;
				if(amount>=(int)company.getpricepershare()){
					int share=(int)(amount/company.getpricepershare());
					try{
						if(amountbalance<share*company.getpricepershare())
						{
							System.out.println("your amount balance  is not enough to buy share");
							break;
						}
						if(share>company.getShares()){
							System.out.println("Company dont have much shares");
							break;
						}
					company.setShares(company.getShares()-share);
					stockObject.setshare(stockObject.getshare()+share);
					queue.enqueue(new Date());
					stack.push(stockObject.getSymbol());
					stock.put("name",stockObject.getName());
					stock.put(stockObject.getSymbol(),stockObject.getshare());
					stock.put("amount",amountbalance);
					object.put("shares",company.getShares());
					setTransaction(object,"buy");
					}
					catch(Exception e){
						System.out.println(e);
						stock.put(symbol,share);
						}
					amountbalance-=share*object.getDouble("pricepershare");
					stock.put("amount",amountbalance);
				}
				else
				{
					System.out.println("your amount is lower than share perprice");
				}
			}
		}
	    if(count==0)
			System.out.println("No companies available for this share");
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	
	public void Savecompany()
	{
		JSONArray arr=new JSONArray();
		int len=List.size();
		for(int i=0;i<len;i++)
		{
			arr.put(List.dequeue());
		}
		try{
			FileWriter company=new FileWriter("company.json");
			company.write(arr.toString());
			company.flush();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	public void Save()
	{
		try{
		FileWriter account=new FileWriter(filename+".json");
		account.write(stock.toString());
		account.flush();
		FileWriter transaction=new FileWriter("Transaction.json");
		transaction.write(trans.toString());
		transaction.flush();
		Savecompany();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	   public boolean checkstock(String symbol) throws Exception
	   {
			  try{
				  if(stock.get(symbol)!=null)
					  return true;
			  }
			  catch(Exception e)
			  {
				  return false;
			  }
			  return false;
	   }
	   
	   public void PrintReport()
	   {
		   	   System.out.println(stock);
		   	   Save();
	   }
	   public void addcompany() throws Exception
	   {
		   JSONObject temp=new JSONObject();
		   System.out.println("Enter the company name");
		   temp.put("name",Utility.GetLine());
		   System.out.println("Enter the StockSymbol");
		   temp.put("symbol",Utility.GetLine());
		   System.out.println("Enter the Shares");
		   temp.put("shares",Utility.GetInt());
		   System.out.println("Enter the shareperprice name");
		   temp.put("pricepershare",Utility.GetDouble());
		   List.insert(temp);
		   Savecompany();
	   }
	   
	   public void removecompany() throws JSONException
	   {
		   System.out.println("Enter the company name");
		   String comp=Utility.GetLine();   
		   for(int i=0;i<array.length();i++)
		   {
			   JSONObject temp=array.getJSONObject(i);
			   company.setName(temp.get("name").toString());
			   if(company.getName().equals(comp))
			   {
                        List.popAt(i);
                        break;
			    }	  
		   }
		   Savecompany();
	   }

}