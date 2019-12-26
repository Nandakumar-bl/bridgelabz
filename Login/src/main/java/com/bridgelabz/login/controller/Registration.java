package com.bridgelabz.login.controller;

import java.io.IOException;
import java.math.BigInteger;
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

@WebServlet("/regist")
public class Registration extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String  username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String security=request.getParameter("securityans");
		BigInteger mob=new BigInteger(request.getParameter("mobilenumber"));
		String query="insert into user values('"+firstname+"','"+lastname+"','"+username+"','"+password+"','"+email+"','"+security+
			                        "',"+mob+")";	
		
		try {
			Connection con=GetConnection.getconnect();
		    Statement st=con.createStatement();
		    st.executeUpdate(query);
		    RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
	         }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
