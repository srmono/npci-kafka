package com.npciproducer.kafka;


public class Product {

	private String productName;
	private String isbn;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Product(String productName, String isbn) {
		super();
		this.productName = productName;
		this.isbn = isbn;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
