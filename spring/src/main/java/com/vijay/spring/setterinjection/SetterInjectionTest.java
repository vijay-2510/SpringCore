package com.vijay.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/spring/setterinjection/config.xml");
		Employee employee = (Employee)context.getBean("emp");
		System.out.println("Employee Id: "+employee.getEmpId()+" Employee Name: "+employee.getEmpName());
	}

}
