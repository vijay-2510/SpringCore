package com.vijay.spring.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleXMLTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/lifecycle/xmlconfig/lifecyclexmlconfig.xml");
		Patient patient = (Patient) context.getBean("patient");

		System.out.println(patient.toString());
		context.registerShutdownHook();

	}

}
