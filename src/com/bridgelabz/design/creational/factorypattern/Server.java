package com.bridgelabz.design.creational.factorypattern;

public class Server extends Computer {
	   private String name;	
	   private String processor;
	   private String RAM;
	   private int price;
	   
	 Server(String name,String processor,String RAM,int price)
	 {
		 this.name=name;
		 this.processor=processor;
		 this.RAM=RAM;
		 this.price=price;
	 }

    public String getName() {
		return name;
	}
	public String getProcessor() {
		return processor;
	}
	public String getRAM() {
		return RAM;
	}
	public int getPrice() {
		return price;
	}
	

}
