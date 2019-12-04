package com.bridgelabz.stock.service;

public interface StockAccount {
	void AddAmount(double amount);
	void Buy(double amount,String symbol);
	void Sell(double amount,String symbol);
	void PrintReport();
	void Save();

}
