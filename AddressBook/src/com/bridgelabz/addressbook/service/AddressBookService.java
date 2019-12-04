package com.bridgelabz.addressbook.service;

public interface AddressBookService 
{
public void CreateAddressbook(String filename)throws Exception;
public void ExsistingAddressbook(String filename)throws Exception;
public void save()throws Exception;
public void Exit();
}
