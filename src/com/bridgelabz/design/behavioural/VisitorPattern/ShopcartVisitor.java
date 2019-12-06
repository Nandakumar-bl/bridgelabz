package com.bridgelabz.design.behavioural.VisitorPattern;

public interface ShopcartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
