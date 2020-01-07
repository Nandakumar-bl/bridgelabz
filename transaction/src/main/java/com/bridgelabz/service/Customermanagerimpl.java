package com.bridgelabz.service;

import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.Customerdao;
import com.bridgelabz.dao.Customermanager;
import com.bridgelabz.model.Customer;

public class Customermanagerimpl implements Customermanager {

	private Customerdao customerDAO;

	public void setCustomerDAO(Customerdao customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}
