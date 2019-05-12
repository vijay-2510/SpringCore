package com.vijay.spring.setterinjection.set;

import java.util.Set;

public class CarDealer {
	private String dealerName;
	private Set<String> carModels;

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public Set<String> getCarModels() {
		return carModels;
	}

	public void setCarModels(Set<String> carModels) {
		this.carModels = carModels;
	}

}
