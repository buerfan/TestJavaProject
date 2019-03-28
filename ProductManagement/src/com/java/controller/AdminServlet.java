package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.DBData;
import com.java.model.ProductsModel;

public class AdminServlet extends HttpServlet {

	DBData db=new DBData();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher rd=null;
		
		rd=request.getRequestDispatcher("/adminlogin.jsp");
		rd.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println("User Name: "+userName  +" Password : "+password);
		RequestDispatcher rd=null;
		
		if(userName.equals("erfan") && password.equals("erfan"))
		{
			List<ProductsModel> pm=db.getProductsModel();
			//ProductsModel pm=new ProductsModel();
			
			request.setAttribute("products", pm);
			request.setAttribute("action", "loggedin");
			//rd=request.getRequestDispatcher("ProductServlet");
			//rd=request.getRequestDispatcher("ProductServlet");
			rd=request.getRequestDispatcher("/admindashboard.jsp");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("/adminlogin.jsp");
			rd.forward(request, response);
		}
		
	}
}
