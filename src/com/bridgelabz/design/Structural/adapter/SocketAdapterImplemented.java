package com.bridgelabz.design.Structural.adapter;

public class SocketAdapterImplemented implements SocketAdapter
{
	Socket socket=new Socket();
 
	public Volts get3volts()
	{
		return ConvertVolt(socket.getVolts(),40);
	}
	public Volts get12volts()
	{
		 return ConvertVolt(socket.getVolts(),10);
		
	}
	public Volts get120volts()
	{
		return ConvertVolt(socket.getVolts(),1);
	}
	public Volts ConvertVolt(Volts volt,int i)
	{
		return new Volts(volt.getVolts()/i);
	}

	
	
}
