package com.bridgelabz.login.controller;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;

import com.bridgelabz.login.serviceimpl.GetConnection;

@WebServlet("/editor")
public class Editor extends HttpServlet
{
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	HttpSession session=request.getSession();
	String username=session.getAttribute("username").toString();
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String security=request.getParameter("securityans");
	BigInteger mob=new BigInteger(request.getParameter("mobilenumber"));
	try
	{
	Connection con=GetConnection.getconnect();
    Statement st=con.createStatement();
	st.executeUpdate("update user set password='"+password+"'where username='"+username+"'");
	st.executeUpdate("update user set Lastname='"+lastname+"'where username='"+username+"'");
	st.executeUpdate("update user set Firstname='"+firstname+"'where username='"+username+"'");
	st.executeUpdate("update user set email='"+email+"'where username='"+username+"'");
	st.executeUpdate("update user set securityAns='"+security+"'where username='"+username+"'");
	st.executeUpdate("update user set mobilenumber='"+mob+"'where username='"+username+"'");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
	rd.forward(request, response);
	
	
}
}
