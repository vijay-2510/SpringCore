package com.vijay.spring.lifecycle.xmlconfig;

public class Patient {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setter method");
		this.name = name;
	}

	public void initialize() {
		System.out.println("Inside init() method");
	}

	public void destruction() {
		System.out.println("Inside destroy() method");
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

}
