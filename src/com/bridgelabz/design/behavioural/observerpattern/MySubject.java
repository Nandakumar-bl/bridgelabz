package com.bridgelabz.design.behavioural.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject 
{
	private List<observer> observer;
	private boolean changed;
	private String msg;
	private String name;
	private final Object MUTEX=new Object();
	
	public MySubject(String name) {
		this.name=name;
		observer=new ArrayList<observer>();
	}
	
	public void register(observer obj)
	{
		synchronized (MUTEX) {
			if(obj == null) throw new NullPointerException("Null Observer");
			synchronized (MUTEX) {
			if(!observer.contains(obj)) observer.add(obj);
			}}
	}
	public void unRegister(observer obj)
	{  synchronized (MUTEX) {
		observer.remove(obj);}
	}
	public void notifyobserver()
	{
		List<observer> duplicate=null;
		if(!changed)
			return;
		synchronized (MUTEX) {
		
		duplicate=new ArrayList<observer>(observer);
		changed=false;
		duplicate.forEach(i->i.update());
		}
	}
	
	public Object getUpdate()
	{
		return msg;
	}
	
	public void postMessage(String str)
	{
		System.out.println("Message is posted");
		this.msg=str;
		changed=true;
		notifyobserver();
	}
	
	

}
