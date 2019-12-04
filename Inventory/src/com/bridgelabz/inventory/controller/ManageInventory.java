/*Author: Nanda kumar.s
 *purpose:program to manage a inventory.  
 * date:29.11.19
 * filename:ManageInventory.java
 */
package com.bridgelabz.inventory.controller;

import java.io.FileReader;

import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.inventory.Utility.Utility;
import com.bridgelabz.inventory.serviceimpl.InventoryManagerImp;



public class ManageInventory {

	public static void main(String[] args) throws Exception {
		InventoryManagerImp inventory;
		System.out.println("enter filename to manage the inventory details");
		String filename=Utility.GetLine();
		inventory=new InventoryManagerImp(filename);
		System.out.println("1.add\n2.remove\n3.change\n4.exit");
		int run=0;
		while(run==0)
		switch(Utility.GetInt())
		{
		case 1:
			inventory.AddMaterial();
	        break;
		case 2:
			inventory.RemoveMaterial();
			break;
		case 3:
			inventory.ChangeMaterial();
			break;
		case 4:
			System.out.println("Exiting.......");
			run=1;
			break;
		default:
			System.out.println("wrong choice :( :( :( :(  \n ThankYou");
			run=1;
		}
	}

}
