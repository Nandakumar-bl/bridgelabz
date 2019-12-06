package com.bridgelabz.design.Structural.ProxyDesign;

public class ProxyPatternRunner {

	public static void main(String[] args) 
	{
	
		String commands[]= {"clone this file","move this file","delete this file","Edit this file"};
		commandRunnerImpl commandrunner=new commandRunnerImpl("nandhu","password");
		for(String temp:commands)
		commandrunner.runCommand(temp);
	}

}
