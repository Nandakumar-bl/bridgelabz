package com.bridgelabz.beans;

import org.springframework.stereotype.Component;

@Component
public class Wheel 
{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
	return brand;
	}

	public Wheel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
