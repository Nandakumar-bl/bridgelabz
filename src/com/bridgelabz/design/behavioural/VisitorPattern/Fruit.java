package com.bridgelabz.design.behavioural.VisitorPattern;

public class Fruit implements ItemElement {
 private String name;
 private int price;
 private int weight;

Fruit(String name,int price, int weight){
	 this.name=name;
	 this.price=price;
	 this.weight=weight;
 }

public String getName() {
	return name;
}

public int getPrice() {
	return price;
}

public int getWeight() {
	return weight;
}

public int accept(ShoppingCartImpl visitor)
{
	return visitor.visit(this);
}
}
