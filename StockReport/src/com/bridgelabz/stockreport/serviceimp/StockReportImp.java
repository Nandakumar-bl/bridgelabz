/*Author: Nanda kumar.s
 *purpose:implementation program to print report of a inventory.  
 * date:1.12.19
 * filename:StockReportImp.java
 */

package com.bridgelabz.stockreport.serviceimp;

import java.io.FileReader; 

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.stockreport.model.Inventoryclass;

public class StockReportImp {
	
	public void PrintReport(String filename)
	{
	try{
	long totalshares=0;
	JSONParser parse=new JSONParser();
	String value=parse.parse(new FileReader(filename+".json")).toString();
	JSONArray array=new JSONArray(value);
	Inventoryclass invent[]=new Inventoryclass[array.length()];
	
	for(int i=0;i<array.length();i++)
		invent[i]=new Inventoryclass();
	
	System.out.println("Name\tprice\tweight\ttotalshareprice\t\t");
	
	for(int i=0;i<array.length();i++)
				{
					JSONObject obj=array.getJSONObject(i);
					invent[i].setName(obj.get("Name").toString());
					System.out.print(invent[i].getName()+"\t");
					invent[i].setPrice((int)obj.get("price"));
					System.out.print(invent[i].getPrice()+"\t");
					invent[i].setWeight((int)obj.get("weight"));
					System.out.print(invent[i].getWeight()+"\t");
					System.out.print(invent[i].getPrice()*invent[i].getWeight());
					totalshares+=invent[i].getPrice()*invent[i].getWeight();
				    System.out.println();	
				}
	System.out.println("\nTotalshare is\t"+totalshares);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
