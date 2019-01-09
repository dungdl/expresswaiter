package com.model.business.models;

public class Table {
	private String id;
	private String name;
	private boolean isAvailable;
	private int floor_id;
	public Table(String id, String name, boolean isAvailable, int floor_id) {
		super();
		this.id = id;
		this.name = name;
		this.isAvailable = isAvailable;
		this.floor_id = floor_id;
		
		if (id == null || name == null) {
		    throw new IllegalArgumentException("Not having enough information to form a table");
		}
		if (floor_id < 0) {
		    throw new IllegalArgumentException("Floor id cannot be negative");
		}
	}
	
	public Table() {
		
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean getIsAvailable() {
        return isAvailable;
    }

	public int getFloor_id() {
		return floor_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setFloor_id(int floor_id) {
		this.floor_id = floor_id;
	}
	
	
	
}
