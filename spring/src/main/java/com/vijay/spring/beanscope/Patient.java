package com.vijay.spring.beanscope;

public class Patient {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

}
