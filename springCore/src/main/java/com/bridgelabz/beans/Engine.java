package com.bridgelabz.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine 
{
	private String cc;
	Engine(String cc)
	{
		this.cc=cc;
	}
	
	public Engine() {
	super();	
	}

	public String getCc() {
		System.out.println("in get cc \n");
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return cc;
	}

}
