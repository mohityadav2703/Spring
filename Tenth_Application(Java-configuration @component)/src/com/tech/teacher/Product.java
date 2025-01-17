package com.tech.teacher;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String productId;
	private String productName;
	private double productPrice;

	public Product() {
		super();
		System.out.println("product object created ..");
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	

}
