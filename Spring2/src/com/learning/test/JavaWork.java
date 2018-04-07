package com.learning.test;

public class JavaWork {

	private Tester tester;
	
	public void setTester(Tester tester) {
		this.tester = tester;
	}
	
	public void doTest() {
		this.tester.test();
	}
}
