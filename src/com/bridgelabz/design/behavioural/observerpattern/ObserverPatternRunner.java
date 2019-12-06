package com.bridgelabz.design.behavioural.observerpattern;

public class ObserverPatternRunner {

	public static void main(String[] args) 
	{
		Subject topic=new MySubject("Java");
		
		observer student1=new SubjectObservers("Kiran");
		observer student2=new SubjectObservers("Vel");
		observer student3=new SubjectObservers("Vinu");
		observer student4=new SubjectObservers("BloodDiamond");
		
		topic.register(student1);
		topic.register(student2);
		topic.register(student3);
		topic.register(student4);
		
		student1.setSubject(topic);
		student2.setSubject(topic);
		student3.setSubject(topic);
		student4.setSubject(topic);
		
		topic.postMessage("Java new feature");
	}

}
