package com.learning.service;

import com.learning.entry.Student;

public class StudentFactory {

	public Student factory() {
		return new Student(5, "koon", 25);
	}
	
	public static Student factory2() {
		return new Student(6, "pooo", 26);
	}
}
