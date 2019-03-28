package com.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.ProductsModel;

public class AddAdminServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher rd=null;
		
		String action=request.getParameter("action");
		ProductsModel pm=new ProductsModel();
		request.setAttribute("productmodel",pm);
		request.setAttribute("action", "addadminproducts");
		System.out.println(action);
		rd=request.getRequestDispatcher("/addadminproducts.jsp");
		rd.forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Print: "+request.getParameter("productDescription"));
		System.out.println("Post method...");
		
		
	}
}
