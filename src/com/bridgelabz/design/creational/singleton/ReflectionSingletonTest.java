package com.bridgelabz.design.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		  EagerInitialization instanceOne = EagerInitialization.getInstance();
	        EagerInitialization instanceTwo = null;
	        EagerInitialization instanceThree = null;
	        
	        try {
	            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	            	System.out.println(constructors.hashCode());
	                constructor.setAccessible(true);
	                instanceTwo = (EagerInitialization) constructor.newInstance();
	                instanceThree = (EagerInitialization) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	        System.out.println(instanceThree.hashCode());

	}

}
