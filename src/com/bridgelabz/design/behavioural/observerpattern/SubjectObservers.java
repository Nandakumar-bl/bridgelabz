package com.bridgelabz.design.behavioural.observerpattern;

public class SubjectObservers  implements observer
{
	
	private String name;
	private Subject subject;
	
	public SubjectObservers(String name) {
	       this.name=name;
	}
	
	public void update()
	{
		String message=(String) subject.getUpdate();
		System.out.println(name+ " you got an update : "+message);
	}
	public void setSubject(Subject subject)
	{
		this.subject=subject;
	}
	

}
