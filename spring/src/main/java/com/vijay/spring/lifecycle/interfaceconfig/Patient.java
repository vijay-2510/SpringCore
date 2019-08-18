package com.vijay.spring.lifecycle.interfaceconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setter method");
		this.name = name;
	}

	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init() method");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() method");

	}
	
	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}


}
