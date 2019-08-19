package com.vijay.spring.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/dependencycheck/dependencycheckconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.toString());
		context.close();

		
	}

}
