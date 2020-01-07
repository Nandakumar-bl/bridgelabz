package com.bridgelabz.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.dao.Customermanager;
import com.bridgelabz.model.Address;
import com.bridgelabz.model.Customer;

public class transaction
{

	
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		Customermanager customerManager = ctx.getBean("customerManager",Customermanager.class);

		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(3);
		customer.setName("Nandu");
		Address address = new Address();
		address.setId(2);
		address.setCountry("India");
		// setting value more than 20 chars, so that SQLException occurs
		address.setAddress("cuddalore,cddalore o.t,tn");
		customer.setAddress(address);
		return customer;
	}
	
	
	
	}
