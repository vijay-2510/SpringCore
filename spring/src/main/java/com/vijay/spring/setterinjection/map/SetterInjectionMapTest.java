package com.vijay.spring.setterinjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMapTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vijay/spring/setterinjection/map/mapconfig.xml");
		Customer customer = (Customer)ctx.getBean("customer");
		System.out.println(customer);
		
	}

}
