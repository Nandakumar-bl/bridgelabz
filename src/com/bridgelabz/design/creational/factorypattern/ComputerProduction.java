package com.bridgelabz.design.creational.factorypattern;

public class ComputerProduction {

	public static Computer Producer(String type,String name,String Processor,String RAM,int price)
	{
		if(type.equalsIgnoreCase("pc"))
			return new PC(name,Processor,RAM,price);
	
		else if(type.equalsIgnoreCase("server"))
			return new Server(name,Processor,RAM,price);
		return null;
	}
}
