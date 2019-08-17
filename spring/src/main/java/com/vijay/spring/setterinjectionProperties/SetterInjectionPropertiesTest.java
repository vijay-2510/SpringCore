package com.vijay.spring.setterinjectionProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionPropertiesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vijay/spring/setterinjectionProperties/propertiesconfig.xml");

		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLanguages");
		System.out.println(countriesAndLanguages.toString());
	}

}
