package com.bridgelabz.ScriptServlet;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.login.serviceimpl.GetConnection;

@WebServlet("/registerq")
public class UserCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String name=request.getParameter("username");
			System.out.println(name);
			Connection con=GetConnection.getconnect();
		    Statement st=con.createStatement();
		    ResultSet r=st.executeQuery("Select * from user");
		    
		    while(r.next())
		    {
		    	System.out.println(r.getString(1));
		    	if(name.equals(r.getString(1))) {
		    		 response.setContentType("text/plain");  
		    		    response.setCharacterEncoding("UTF-8"); 		    		 
		    		    response.getWriter().println("username already exsist"); 
		    		    }
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
