package com.bridgelabz.design.behavioural.mediator;

public class MediatorPattern {

	public static void main(String[] args) {
	
		Mediator mediator=new MediatorImpl();
		user user1=new userImpl(mediator,"Nandhu");
		user user2=new userImpl(mediator,"pavi");
		user user3=new userImpl(mediator,"kavi");
		user user4=new userImpl(mediator,"sekar");
		mediator.add(user1);
		mediator.add(user2);
		mediator.add(user3);
		mediator.add(user4);
		
		user1.send("hi to all");

	}

}
