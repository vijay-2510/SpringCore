package com.vijay.spring.autowiring.constructor;

public class Student {
	private int id;
	private Score scores;
	
	Student(Score score){
		this.scores = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", scores=" + scores + "]";
	}

}
