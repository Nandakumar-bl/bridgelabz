package com.bridgelabz.design.creational.prototype;

import java.util.List;

public class EmployeeCloner {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee Employee=new Employee();
		Employee.loadList();
	
		List baseList=Employee.returnList();
		Employee clonedobject1=(Employee)Employee.clone();
		List clonedlist1=clonedobject1.returnList();
		clonedlist1.add("Nandhu");
		Employee clonedObject2=(Employee)Employee.clone();
		List clonedList2=clonedObject2.returnList();
		clonedList2.remove("Jonsnow");
		
		System.out.println("baselist :");
		baseList.forEach(i->System.out.print(i+" "));
		System.out.println("\nclonedlist1 :");
		clonedlist1.forEach(i->System.out.print(i+" "));
		System.out.println("\nclonedlist2 :");
		clonedList2.forEach(i->System.out.print(i+" "));

	}

}
