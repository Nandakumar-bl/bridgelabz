package com.bridgelabz.login.serviceimpl;

import java.sql.*; 
import com.bridgelabz.login.service.Provider;

public class GetConnection implements Provider
{
	public static Connection getconnect()
	{
		Connection con=null;
	try
	{
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  con=DriverManager.getConnection(url,username,password);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
	}
}
