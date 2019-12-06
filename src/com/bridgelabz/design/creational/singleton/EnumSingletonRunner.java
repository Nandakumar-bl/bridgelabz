package com.bridgelabz.design.creational.singleton;
enum EnumSingleton{
	Instance;
	
	public static EnumSingleton getInstance()
	{
		return Instance;
	}
}

public class EnumSingletonRunner 
{
	public static void main(String[] args) {

	 System.out.println(EnumSingleton.getInstance().hashCode());
	 System.out.println(EnumSingleton.getInstance().hashCode());

	}
}
