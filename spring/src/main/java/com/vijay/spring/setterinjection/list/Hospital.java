package com.vijay.spring.setterinjection.list;

import java.util.List;

public class Hospital {
	private String hospitalName;
	private List<String> departments;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

}
