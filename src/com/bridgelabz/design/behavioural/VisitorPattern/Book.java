package com.bridgelabz.design.behavioural.VisitorPattern;

public class Book implements ItemElement {

	private String name;
	private int IBSN;
	private int cost;
	
	Book(String name,int IBSN,int cost)
	{
		this.name=name;
		this.cost=cost;
		this.IBSN=IBSN;	
	}

	public String getName() {
		return name;
	}

	public int getIBSN() {
		return IBSN;
	}

	public int getCost() {
		return cost;
	}
	public int accept(ShoppingCartImpl visitor)
	{
		return visitor.visit(this);
	}
	
}
