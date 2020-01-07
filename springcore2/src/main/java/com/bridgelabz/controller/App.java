package com.bridgelabz.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Laptop;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Laptop laptop=(Laptop)context.getBean("laptop");
    	System.out.println(laptop.getHarddisk().getCapacity());
    	
    	
    	
      
    }
}
