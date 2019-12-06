package com.bridgelabz.design.Structural.ProxyDesign;

public class commandRunnerImpl implements CommandRunner 
{
	CommandRunner runner;
	private boolean userAdmin;
	public commandRunnerImpl(String admin,String password) 
	{
	  if("Nandhu".equals(admin) && "Password".equals(password))
	  {
		  userAdmin = true;
	  }
	  runner=new CommandExecutor();
	}
	
	public void runCommand(String command)
	  {
		if(userAdmin)
		{
		   runner.runCommand(command);	
		}		
		else
		{
		
			if(command.trim().startsWith("delete") || command.trim().startsWith("move"))
					{
				System.out.println("you are not a Admin to execute this command:  "+command);
					}
			else {
				runner.runCommand(command);
			}
		  
	    }
	}

}
