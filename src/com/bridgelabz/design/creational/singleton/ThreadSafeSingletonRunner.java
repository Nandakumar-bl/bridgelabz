package com.bridgelabz.design.creational.singleton;

class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
        	System.out.println("Instace creation check");
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	            	System.out.println("Instace creation check");
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
}
    
}
public class ThreadSafeSingletonRunner {

	public static void main(String[] args) 
	{
	   for(int i=0;i<5;i++)
	   {
		  Thread Thread1=new Thread(()->ThreadSafeSingleton.getInstanceUsingDoubleLocking());
		  Thread Thread2=new Thread(()->ThreadSafeSingleton.getInstance());
		  Thread1.start();
		  Thread2.start();
	   }
	   
	   
		

	}

}
