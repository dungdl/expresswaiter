package com.model.business.models;

public class Floor {
	private int id;
	private String name;
	
	public Floor() {
		
	}

	public Floor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
