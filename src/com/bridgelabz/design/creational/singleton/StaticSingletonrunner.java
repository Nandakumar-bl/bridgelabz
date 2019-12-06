package com.bridgelabz.design.creational.singleton;

class StaticInitialized {
	
	private static  StaticInitialized instance;
	
	private  StaticInitialized () {}
	
	static {
		try {
		    instance=new StaticInitialized();
	       }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static StaticInitialized getInstance()
	{
		return instance;
	}
}
	public class StaticSingletonrunner
	{

	public static void main(String[] args) {
			
		StaticInitialized realobject=StaticInitialized.getInstance();
		System.out.println(realobject.hashCode());
		StaticInitialized realobject1=StaticInitialized.getInstance();
		System.out.println(realobject1.hashCode());
	}

}
