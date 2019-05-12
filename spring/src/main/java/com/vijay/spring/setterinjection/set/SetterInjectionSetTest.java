package com.vijay.spring.setterinjection.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionSetTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/setterinjection/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		System.out.println("Dealer Name: " + carDealer.getDealerName());
		carDealer.getCarModels().forEach(c -> System.out.println(c));

	}

}
