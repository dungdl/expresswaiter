package com.model.business.models;

public class Item {
	private int id;
	private String name;
	private double price;
	private double discount;
	private int type;
	private String detail;
	public Item(int id, String name, double price, double discount, int type, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.type = type;
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public int getType() {
		return type;
	}
	public String getDetail() {
		return detail;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
