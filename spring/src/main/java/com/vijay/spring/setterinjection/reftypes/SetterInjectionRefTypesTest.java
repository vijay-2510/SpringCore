package com.vijay.spring.setterinjection.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionRefTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/setterinjection/reftypes/reftypesconfig.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student.toString());
	}

}
