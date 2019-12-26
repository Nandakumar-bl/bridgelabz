package com.bridgelabz.ScriptServlet;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.login.serviceimpl.GetConnection;

@WebServlet("/checking")
public class checker extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String name=request.getParameter("username");
			
		    boolean flag=false;
			Connection con=GetConnection.getconnect();
		    Statement st=con.createStatement();
		    ResultSet r=st.executeQuery("Select * from user");
			while(r.next())
			{
				if(r.getString(1).equals(name))
				{
					flag=true;
					
				}
			}
			if(flag==false)
			{
				response.getWriter().println("No user in this Name");
			}
			else
				response.getWriter().println("Enter password");
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}


}
