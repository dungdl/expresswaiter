package com.model.business.models;

public class Order {
	private String id;
	private String name;
	private double price;
	private double discount;
	private String billId;
	private boolean checked;

	private static long idCount = 0;
	public Order() {
		
	}

	public Order(Item item, String billId) {
		if (idCount < 10) {
			this.id = "0" + idCount + item.getId() + "F" + billId;
		} else
			this.id = idCount + item.getId() + "F" + billId;
		this.name = item.getName();
		this.price = item.getPrice();
		this.discount = item.getDiscount();
		this.billId = billId;
		this.checked = false;
		idCount++;
	}

	public String getId() {
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

	public String getBillId() {
		return billId;
	}

	public boolean isChecked() {
		return checked;
	}

	public static long getIdCount() {
		return idCount;
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

	public void setChecked(boolean isChecked) {
		this.checked = isChecked;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	
}
