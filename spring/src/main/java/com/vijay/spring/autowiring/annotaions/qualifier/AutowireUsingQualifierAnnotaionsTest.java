package com.vijay.spring.autowiring.annotaions.qualifier;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireUsingQualifierAnnotaionsTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/autowiring/annotaions/qualifier/autowireusingannotationsqualifier.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student.toString());
		context.close();
	}

}
