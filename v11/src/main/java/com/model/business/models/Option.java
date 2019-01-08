package com.model.business.models;

public class Option {
	private String name;
	private String attri;
	public Option(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAttri() {
		return attri;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAttri(String attri) {
		this.attri = attri;
	}
}
