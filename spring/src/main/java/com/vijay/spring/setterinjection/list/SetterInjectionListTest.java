package com.vijay.spring.setterinjection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionListTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/setterinjection/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name: " + hospital.getHospitalName());
		hospital.getDepartments().forEach(h -> System.out.println(h));
	}

}
