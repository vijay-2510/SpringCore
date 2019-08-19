package com.vijay.spring.autowiring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;

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
	@Autowired
	public void setScores(Score scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", scores=" + scores + "]";
	}

}
