package com.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	
	RequestDispatcher rd=null;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		rd=request.getRequestDispatcher("/admindashboard.jsp");
		
		rd.forward(request, response);
		System.out.println(request.getParameter("action"));
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		rd=request.getRequestDispatcher("/admindashboard.jsp");
		
		rd.forward(request, response);
		System.out.println(request.getParameter("action"));
	}

}
