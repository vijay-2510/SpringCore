package com.vijay.spring.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class Patient {
	private String name;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

}
