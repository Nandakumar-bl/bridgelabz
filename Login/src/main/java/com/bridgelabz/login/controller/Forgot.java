package com.bridgelabz.login.controller;

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


@WebServlet("/passwordch")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String securityans=request.getParameter("securityans");
		String newpassword=request.getParameter("password");
		boolean check=false;
		try {
		Connection con=GetConnection.getconnect();
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from user");
	    while(rs.next()) {
	    if(securityans.equals(rs.getString(6)) && username.equals(rs.getString(1)))
	    {
	    	check=true;
	    	st.executeUpdate("update user set password='"+newpassword+"'where username='"+username+"'");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);	
	    }
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
