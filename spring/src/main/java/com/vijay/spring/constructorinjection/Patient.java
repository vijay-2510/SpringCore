package com.vijay.spring.constructorinjection;

public class Patient {
	private int id;
	private String name;

	Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}

}
