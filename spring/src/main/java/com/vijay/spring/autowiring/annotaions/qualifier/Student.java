package com.vijay.spring.autowiring.annotaions.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	@Autowired(required = false) // so that if no match bean found null will be assigned, no exception will be thrown
	@Qualifier("score")
	private Score scores;
	
	
	
	public Student(Score scores) {
		super();
		this.scores = scores;
	}

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
