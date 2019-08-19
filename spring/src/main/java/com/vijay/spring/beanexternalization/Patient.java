package com.vijay.spring.beanexternalization;

public class Patient {
	private String hospitalName;
	private String name;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [hospitalName=" + hospitalName + ", name=" + name + "]";
	}

}
