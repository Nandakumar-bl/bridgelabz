package com.bridgelabz.design.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
	
	List<user> users;
	
	MediatorImpl()
	{
		users=new ArrayList<user>();
	}
	
	public void add(user user)
	{
		users.add(user);
	}
	public void sendMessage(String message,user user)
	{
		for(user u:users)
		{
		  if(user!=u)	
			  u.recieve(message);
		}
			
	}

}
