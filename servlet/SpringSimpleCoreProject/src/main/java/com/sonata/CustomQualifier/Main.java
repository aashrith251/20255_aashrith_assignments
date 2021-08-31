package com.sonata.CustomQualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfiguration.class)
public class Main {
	
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Main.class,
				args);

		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
	
	

}