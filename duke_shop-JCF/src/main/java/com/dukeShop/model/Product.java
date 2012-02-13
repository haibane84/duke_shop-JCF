package com.dukeShop.model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pid;
	private String pname;
	private String photo;
	private String description;
	private int price;
	private int stock;

	public Product() {
	}

	public Product(String pid, String pname, String photo, String desc,
			int price, int stock) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.photo = photo;
		this.setDescription(desc);
		this.stock = stock;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
