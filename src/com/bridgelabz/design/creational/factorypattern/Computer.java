package com.bridgelabz.design.creational.factorypattern;

public abstract class Computer {
	public abstract String getName();
	public abstract String getProcessor();
	public abstract String getRAM();
	public abstract int getPrice();
	@Override
	public String toString() {
		return "Name=" + getName() + ", Processor=" + getProcessor() + ",RAM=" + getRAM()
				+ ", Price=" + getPrice();
	}
	
	
}
