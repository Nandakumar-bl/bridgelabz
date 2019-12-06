package com.bridgelabz.design.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Singleton implements Serializable  { 
     
    private Singleton()  
    { 
    } 
    private static class Instantiator
    {
        private static final Singleton instance = new Singleton(); 
    }
 
    public static Singleton getinstance()
    {
    	return Instantiator.instance;
    }
    protected Object readResolve() 
    { 
        return getinstance(); 
    } 
} 
  
public class SerializedSingletonRunner  
{ 
  
    public static void main(String[] args) throws Exception
    { 
    	
            Singleton instance1 = Singleton.getinstance(); 
            ObjectOutput out= new ObjectOutputStream(new FileOutputStream("file.text")); 
            out.writeObject(instance1); 
            out.close(); 
          
            ObjectInput in= new ObjectInputStream(new FileInputStream("file.text")); 
            Singleton instance2 = (Singleton) in.readObject(); 
            in.close(); 
          
            System.out.println("instance1 hashCode:- "
                                           + instance1.hashCode()); 
            System.out.println("instance2 hashCode:- "
                                           + instance2.hashCode()); 
    } 
} 