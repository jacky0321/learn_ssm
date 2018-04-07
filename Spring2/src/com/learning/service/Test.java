package com.learning.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.test.JavaWork;
import com.learning.test.Mary;

public class Test {

	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		JavaWork javaWork = (JavaWork)aContext.getBean("javaWork");
		javaWork.doTest();
	}
}
