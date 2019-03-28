package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.java.model.ProductsModel;

public class DBData {

	public List<ProductsModel> getProductsModel() {
		List<ProductsModel> pm=new ArrayList<>();
		
		Connection con=new Connection();
		Session session=con.getSessionFactory().openSession();
		
		Query query=session.createQuery("from ProductsModel pm");
		pm=query.list();
		
		return pm;
	}

}
