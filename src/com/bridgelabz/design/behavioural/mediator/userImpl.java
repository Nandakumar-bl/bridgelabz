package com.bridgelabz.design.behavioural.mediator;

public class userImpl implements user{
	private Mediator mediator;
	private String name;
	public userImpl(Mediator med, String name) {
		this.mediator=med;
		this.name=name;
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void recieve(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

	
}
