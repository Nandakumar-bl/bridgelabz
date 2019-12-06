package com.bridgelabz.design.behavioural.observerpattern;

public interface Subject 
{
	public void register(observer obj);
	public void unRegister(observer obj);
	public void notifyobserver();
	public Object getUpdate();
	public void postMessage(String str);

}
