package com.bridgelabz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.annotations.annot;

@Component
public class Car 
{
	@Autowired
	private Wheel wheel;
	@Autowired
	private Engine engine;
	
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	@annot
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		System.out.println("inside car");
		System.out.println("car [wheel=" + wheel + ", engine=" + engine + "]");
		return "";
	}
	
	

}
