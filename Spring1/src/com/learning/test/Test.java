package com.learning.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.entry.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student)aContext.getBean("student");
		System.out.println(student);
		
		Student student1 = (Student)aContext.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student)aContext.getBean("student2");
		System.out.println(student2);
		
		Student student3 = (Student)aContext.getBean("student3");
		System.out.println(student3);
		
		Student student4 = (Student)aContext.getBean("student4");
		System.out.println(student4);
		
		Student student5 = (Student)aContext.getBean("student5");
		System.out.println(student5);
		
		Student student6 = (Student)aContext.getBean("student6");
		System.out.println(student6);
	}
}
