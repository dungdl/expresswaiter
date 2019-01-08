package com.model.business.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Bill {
	private String id;
	private boolean checked;
	private String tableId;
	private String date;
	private String waiter;
	
//	private HashMap<String, Order> listOrder;
	private ArrayList<Order> listOrder;
	
	public Bill() {
		
	}

	public Bill(String id, boolean isChecked, String tableId) {
		super();
		this.id = id;
		this.checked = isChecked;
		this.tableId = tableId;
//		listOrder = new HashMap<String, Order>();
		listOrder = new ArrayList<Order>();
	}

	public String getId() {
		return id;
	}

	public boolean getChecked() {
		return checked;
	}

	public String getTableId() {
		return tableId;
	}

	public String getDate() {
		return date;
	}

	public String getWaiter() {
		return waiter;
	}

	public ArrayList<Order> getListOrder() {
		return listOrder;
	}

	public void setChecked(boolean isChecked) {
		this.checked = isChecked;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setWaiter(String waiter) {
		this.waiter = waiter;
	}

	public void setListOrder(ArrayList<Order> listOrder) {
		this.listOrder = listOrder;
	}

	
	
}
