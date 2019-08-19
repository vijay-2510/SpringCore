package com.vijay.spring.constructorinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/constructorinjection/constructorinjectionconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.toString());
		context.close();

	}

}
