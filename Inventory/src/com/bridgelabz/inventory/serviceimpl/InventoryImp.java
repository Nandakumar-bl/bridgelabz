/*Author: Nanda kumar.s
 *purpose:implementation of inventory creation.  
 * date:28.11.19
 * filename:InventoryImp.java
 */
package com.bridgelabz.inventory.serviceimpl;

import java.io.FileWriter; 


import org.json.JSONArray;
import org.json.JSONObject;

import com.bridgelabz.inventory.Utility.Utility;
import com.bridgelabz.inventory.model.Inventoryclass;
import com.bridgelabz.inventory.service.Inventory;

public class InventoryImp implements Inventory
{
	public  void CreateInventory(String filename)
	{
	try{
		JSONArray arr=new JSONArray();
		System.out.println("Enter the inventory limit");
		int items=Utility.GetInt();
		Inventoryclass invent[]=new Inventoryclass[items];
			for(int i=0;i<items;i++)
			{
				invent[i]=new Inventoryclass();
				JSONObject object=new JSONObject();
				System.out.println("Enter the inventory name");
				invent[i].setName(Utility.GetLine());
				object.put("Name",invent[i].getName());
				System.out.println("Enter the inventory price");
				invent[i].setPrice(Utility.GetInt());
				 object.put("price",invent[i].getPrice());
				System.out.println("Enter the inventory weight");
			    invent[i].setWeight(Utility.GetInt());
			    object.put("weight",invent[i].getWeight());
			    object.put("totalshareprice",invent[i].getPrice()*invent[i].getWeight());
			    arr.put(object);
			}
	FileWriter fw=new FileWriter(filename+".json");
	fw.write(arr.toString());		
	fw.flush();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}		

}
}
