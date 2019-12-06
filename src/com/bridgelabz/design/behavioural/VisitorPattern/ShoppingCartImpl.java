package com.bridgelabz.design.behavioural.VisitorPattern;

public class ShoppingCartImpl implements ShopcartVisitor 
{
	
	public int visit(Book book)
	{
		System.out.print("IBSN number is:"+book.getIBSN());
		System.out.println(" Cost is :"+book.getCost());
		return book.getCost();
	}
	public int visit(Fruit fruit)
	{
		System.out.println(fruit.getName()+" "+fruit.getPrice()+" "+fruit.getWeight()+" TOTAL "+fruit.getPrice()*fruit.getWeight());
		return fruit.getPrice()*fruit.getWeight();
	}

}
