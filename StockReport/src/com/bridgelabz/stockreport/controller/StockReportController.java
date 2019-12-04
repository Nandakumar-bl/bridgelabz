/*Author: Nanda kumar.s
 *purpose:program to print report of a inventory.  
 * date:1.12.19
 * filename:StockReportController.java
 */

package com.bridgelabz.stockreport.controller;

import java.io.FileReader; 

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.stockreport.Utility.Utility;
import com.bridgelabz.stockreport.serviceimp.StockReportImp;

public class StockReportController {

	public static void main(String[] args) throws Exception
	{
		StockReportImp report=new StockReportImp();
		System.out.println("Enter the file name to print the inventory report");
		String file=Utility.GetLine();
		report.PrintReport(file);	
	}

}
