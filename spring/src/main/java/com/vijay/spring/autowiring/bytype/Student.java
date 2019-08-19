package com.vijay.spring.autowiring.bytype;

public class Student {
	private int id;
	private Score scores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Score getScores() {
		return scores;
	}

	public void setScores(Score scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", scores=" + scores + "]";
	}

}
