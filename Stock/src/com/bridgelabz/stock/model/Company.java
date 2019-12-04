package com.bridgelabz.stock.model;

public class Company {
	private String name;
	private String stocksymbol;
	private double pricepershare;
	private int shares;
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStocksymbol() {
		return stocksymbol;
	}
	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}
	public double getpricepershare() {
		return pricepershare;
	}
	public void setpricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}
	

}
