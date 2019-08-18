package com.vijay.spring.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleAnnotationsTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/lifecycle/annotations/lifecycleannotationsconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.toString());
		context.registerShutdownHook();
		context.close();

	}

}
