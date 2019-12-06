package com.bridgelabz.design.Structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter
{
	
	public Volts get3volts()
	{
		return ConvertVolt(getVolts(),40);
	}
	public Volts get12volts()
	{
		 return ConvertVolt(getVolts(),10);
		
	}
	public Volts get120volts()
	{
		return ConvertVolt(getVolts(),1);
	}
	public Volts ConvertVolt(Volts volt,int i)
	{
		return new Volts(volt.getVolts()/i);
	}

}
