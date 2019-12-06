package com.bridgelabz.design.creational.singleton;
class EagerInitialization {
	private static EagerInitialization instance=new EagerInitialization();
	
	private EagerInitialization() {}
	
	public static EagerInitialization getInstance()
	{
		return instance;
	}
}
public class EagerSingletonRunner
{
	public static void main(String[] args) 
	{
		
		EagerInitialization object1=EagerInitialization.getInstance();
		System.out.println(object1.hashCode());
		EagerInitialization object2=EagerInitialization.getInstance();
		System.out.println(object2.hashCode());
		
	}

}
