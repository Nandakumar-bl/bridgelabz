/*Author: Nanda kumar.s
 *purpose:implementation for inventory management.  
 * date:28.11.19
 * filename:InventoryManagerImp.java
 */
package com.bridgelabz.inventory.serviceimpl;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.Utility.Utility;
import com.bridgelabz.inventory.model.Inventoryclass;
import com.bridgelabz.inventory.service.InventoryManager;

public class InventoryManagerImp implements InventoryManager
{
	JSONArray array;
	String filename;
	
	public InventoryManagerImp(String filename) throws Exception
	{
		this.filename=filename;
		JSONParser parse=new JSONParser();
		String value=parse.parse(new FileReader(filename+".json")).toString();
		array=new JSONArray(value);
	}
		
		
		public void AddMaterial(){
			try{
				Inventoryclass invent=new Inventoryclass();
				JSONObject object=new JSONObject();
				System.out.println("Enter the inventory name");
				invent.setName(Utility.GetLine());
				object.put("Name",invent.getName());
				System.out.println("Enter the inventory price");
				invent.setPrice(Utility.GetInt());
				 object.put("price",invent.getPrice());
				System.out.println("Enter the inventory weight");
			    invent.setWeight(Utility.GetInt());
			    object.put("weight",invent.getWeight());
			    object.put("totalshareprice",invent.getPrice()*invent.getWeight());
			    array.put(object);		    
			    Save(filename);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void RemoveMaterial()
		{
			System.out.println("Enter the material name to remove");
			String name=Utility.GetLine();
			try{
				for(int i=0;i<array.length();i++)
				{
					JSONObject obj=array.getJSONObject(i);
					if(obj.get("Name").equals(name))
					{
						array.remove(i);
						break;
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("you dont have that material in your inventory");
			}
			Save(filename);
			
			
		}
		
		public void ChangeMaterial(){		
			try{
			Inventoryclass invent=new Inventoryclass();
			System.out.println("Enter the material name to change");
			String change=Utility.GetLine();
			int count=0;
			for(int i=0;i<array.length();i++)
			{
				JSONObject 	object=array.getJSONObject(i);
				if(object.get("Name").equals(change))
				{
					count++;
					invent.setPrice(object.getInt("price"));
					invent.setWeight(object.getInt("weight"));
				System.out.println("Enter 1.change price of "+object.get("Name")+ 
						"and \nEnter 2.change quantity of "+object.get("Name")+
				        "\nEnter 3.change  both \n 4.no changes");
				int choice=Utility.GetInt();
					switch(choice)
							{
							case 1:
								System.out.println("Enter the new price per kg");
								invent.setPrice(Utility.GetInt());
								object.put("price",invent.getPrice());
								break;
								
							case 2:
								System.out.println("Enter the new quantity");
								invent.setWeight(Utility.GetInt());
								object.put("weight",invent.getWeight());
								break;
							case 3:
								System.out.println("Enter the new price per kg");
								invent.setPrice(Utility.GetInt());
								object.put("price",invent.getPrice());
								System.out.println("Enter the new quantity");
								invent.setWeight(Utility.GetInt());
								object.put("weight",invent.getWeight());
								break;
							case 4:
								System.out.println("Not changed ");
								break;
							
							default:
								System.out.println(object.get("Wrong choice")+" :( :( :( ");
								break;
							}
				    object.put("totalshareprice",(invent.getPrice()*invent.getWeight()));
					break; 
				}
			  }
			if(count==0)
				System.out.println("no inventory in this name");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			Save(filename);
			}
	public void Save(String filename)
	{
		try
		{
			FileWriter fw=new FileWriter(filename+".json");
			fw.write(array.toString());		
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
