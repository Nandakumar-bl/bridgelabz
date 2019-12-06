package com.bridgelabz.design.Structural.ProxyDesign;

public class CommandExecutor implements CommandRunner 
{
	public void runCommand(String command)
	{
		System.out.println("cmd: "+command+ " is Executed");
	}

}
