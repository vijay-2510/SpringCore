package com.vijay.spring.beanscope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/beanscope/beanscopeconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		Patient patient1 = (Patient) context.getBean("patient");
		// both hashcode will be different as scope is prototype
		System.out.println(patient.hashCode());
		System.out.println(patient1.hashCode());

		context.close();

	}

}
