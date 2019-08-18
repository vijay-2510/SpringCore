package com.vijay.spring.lifecycle.interfaceconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleInterfaceTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/lifecycle/interfaceconfig/lifecycleinterfaceconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.toString());
		context.registerShutdownHook();

	}

}
