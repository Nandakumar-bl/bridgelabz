package com.bridgelabz.design.creational.singleton;

class LazyInitializedSingleton {
		
		private static LazyInitializedSingleton instance;
		
		private LazyInitializedSingleton() {}
		
		public static LazyInitializedSingleton getInstance()
		{
		if(instance==null)
				return instance=new LazyInitializedSingleton();
			
			return instance;
		}
}
		
	public class LazyInitializedSingletonrunner
	{
	public static void main(String[] args)
	{
		
		LazyInitializedSingleton obj1=LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton obj2=LazyInitializedSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	}


