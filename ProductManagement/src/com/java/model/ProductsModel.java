package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class ProductsModel {
	
	@Id
	@GeneratedValue
	private int productId;
	
	
	private String title;
	
	private int productPrice;
	
	private int productCatagory;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductCatagory() {
		return productCatagory;
	}

	public void setProductCatagory(int productCatagory) {
		this.productCatagory = productCatagory;
	}
	

}
