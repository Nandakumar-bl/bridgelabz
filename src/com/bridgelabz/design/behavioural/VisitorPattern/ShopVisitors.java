package com.bridgelabz.design.behavioural.VisitorPattern;

public class ShopVisitors {

	public static void main(String[] args) {
		ItemElement item[]=new ItemElement[]{new Book("HarryPotter",2012,200),new Fruit("Apple",20,5)};
		int total=calculateprice(item);
		System.out.println("The total is :"+total);
	}
	public static  int calculateprice(ItemElement item[])
	{
		ShoppingCartImpl visitor=new ShoppingCartImpl();
		int sum=0;
       for(ItemElement tempitem:item)
		sum+=tempitem.accept(visitor);
		return sum;
	}

}
