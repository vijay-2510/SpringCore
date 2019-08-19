package com.vijay.spring.beanexternalization;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanExternalizationTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/beanexternalization/beanexternalizationconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.toString());
		context.close();

	}

}
