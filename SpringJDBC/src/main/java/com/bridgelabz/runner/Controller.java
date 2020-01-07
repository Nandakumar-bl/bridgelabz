package com.bridgelabz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.dao.DaoImpl;
import com.bridgelabz.model.Employee;

public class Controller 
{
  
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	DaoImpl daoobject=(DaoImpl)context.getBean("dao");
	
		/*
		 * daoobject.saveEmployee(new Employee(1,"nandu",20000));
		 * daoobject.saveEmployee(new Employee(2,"subash",15000));
		 * daoobject.saveEmployee(new Employee(3,"manoj",19000));
		 * daoobject.saveEmployee(new Employee(4,"ahfaan",100000));
		 * daoobject.saveEmployee(new Employee(5,"pavi",40000));
		 */
	
		daoobject.deleteEmployee(1);
	
	
	
	
	
	
	
	}
	
	
	
}
