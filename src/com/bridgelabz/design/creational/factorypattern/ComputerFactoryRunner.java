package com.bridgelabz.design.creational.factorypattern;

public class ComputerFactoryRunner {

	public static void main(String[] args) {
		
		Computer pc=ComputerProduction.Producer("pc","Apple","Bionic a3","4 GB",100000);
		Computer server=ComputerProduction.Producer("server","Dell","Intel core i7","6 GB",80000);
	
		System.out.println("PC configuration:"+pc);
		System.out.println("server configuration:"+server);
	
	}

}
