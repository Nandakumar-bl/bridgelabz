/*Author: Nanda kumar.s
 *purpose:program to create an inventory.  
 * date:29.11.19
 * filename:CreateInventory.java
 */
package com.bridgelabz.inventory.controller;

import java.io.FileWriter; 

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.inventory.Utility.Utility;
import com.bridgelabz.inventory.serviceimpl.InventoryImp;


public class CreateInventory {

	public static void main(String[] args) throws Exception 
	{
		InventoryImp inventory=new InventoryImp();
		System.out.println("enter file name");
		String file=Utility.GetLine();
		inventory.CreateInventory(file);
		System.out.println("Iventory created successfully");
		
	}

}
