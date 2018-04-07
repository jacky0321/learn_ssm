package com.learning.model;

import java.util.List;

public class Grade {

	private int id;
	private String gradeName;
	private List<Student> students;
	
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Grade(String gradeName) {
		super();
		this.gradeName = gradeName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", students=" + students + "]";
	}
	
}
