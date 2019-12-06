package com.bridgelabz.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable
{
	List<String> original;

	public Employee()
	{
		original=new ArrayList<String>();
	}
	public Employee(List<String> list)
	{
		original=list;
	}
	public void loadList()
	{
		original.add("Pavi");
		original.add("Kavi");
		original.add("Sekar");
		original.add("Jonsnow");
	}
	
	public List returnList()
	{
		return original;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		List<String> Temporary = new ArrayList<String>();
		original.forEach(i->Temporary.add(i));
		
		return new Employee(Temporary);
		
	}
}
