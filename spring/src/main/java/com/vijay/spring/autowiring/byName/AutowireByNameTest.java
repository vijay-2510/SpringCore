package com.vijay.spring.autowiring.byName;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByNameTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/autowiring/byName/autowirebynameconfig.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student.toString());
		context.close();
	}

}
