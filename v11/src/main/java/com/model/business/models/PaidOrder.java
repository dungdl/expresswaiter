package com.model.business.models;

public class PaidOrder {
	private String name;
	private Order order;
	private int count;

	public PaidOrder(String name, Order order) {
		this.order = order;
		this.name = name;
		this.count = 1;
	}

	public void increase() {
		this.count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Order getOrder() {
		return order;
	}

	
}
