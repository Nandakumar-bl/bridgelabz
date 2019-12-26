package com.bridgelabz.login.controller;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bridgelabz.login.serviceimpl.GetConnection;

@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
	String user=request.getParameter("username");
	String pass=request.getParameter("password");
	boolean check=false;
	try {
	Connection con=GetConnection.getconnect();
	PreparedStatement st=(PreparedStatement) con.prepareStatement("select * from user");
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{
		if(user.equals(rs.getString(1)) &&  pass.equals(rs.getString(2)))
		{	
			HttpSession session=request.getSession();
			session.setAttribute("username",user);
			 response.sendRedirect("Welcome.jsp");
			 check=true;
		}
	}
	
	if(check==false)
	{
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	
}
