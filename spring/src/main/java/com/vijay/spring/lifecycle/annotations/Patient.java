package com.vijay.spring.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setter method");
		this.name = name;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside init() method");
	}

	@PreDestroy
	public void destruction() {
		System.out.println("Inside destroy() method");
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

}
