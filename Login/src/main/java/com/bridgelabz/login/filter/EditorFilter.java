package com.bridgelabz.login.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/editor")
public class EditorFilter implements Filter {

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
	
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession session=req.getSession();
		System.out.println("before");
		if(session.getAttribute("username")==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		System.out.println("after");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

	public void destroy() {
		
	}

}