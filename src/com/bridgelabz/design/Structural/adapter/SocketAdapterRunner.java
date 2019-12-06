package com.bridgelabz.design.Structural.adapter;

public class SocketAdapterRunner {

	public static void main(String[] args) 
	{
		classAdapter();
		ImplAdapter();
		
	}
	public static  void classAdapter()
	{
		SocketAdapter adapter=new SocketClassAdapter();
		Volts v3=getVolt(adapter,3);
		Volts v12=getVolt(adapter,12);
		Volts v120=getVolt(adapter,120);
		System.out.println("Through class");
		System.out.println("get 3 volts:"+v3.getVolts());
		System.out.println("get 12 volts:"+v12.getVolts());
		System.out.println("get 120 volts:"+v120.getVolts());
		}

	public static  void ImplAdapter()
	{
		SocketAdapter adapter=new SocketAdapterImplemented();
		Volts v3=getVolt(adapter,3);
		Volts v12=getVolt(adapter,12);
		Volts v120=getVolt(adapter,120);
		System.out.println("Through implemented");
		System.out.println("get 3 volts:"+v3.getVolts());
		System.out.println("get 12 volts:"+v12.getVolts());
		System.out.println("get 120 volts:"+v120.getVolts());
		}

	public static Volts getVolt(SocketAdapter adapter,int i)
	{
		switch(i)
		{
		case 3:return adapter.get3volts();
		case 12:return adapter.get12volts();
		case 120:return adapter.get120volts();
		}
		return adapter.get120volts();
	}
}
