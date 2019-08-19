package com.vijay.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/innerbeans/innerbeanconfig.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student.toString());
	}

}
