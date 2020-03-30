package com.prateek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same bean, comparing the object reference

		boolean result = (coach == alphaCoach);

		// print out the results

		System.out.println("\n Pointing to the same object: " + result);

		System.out.println("\n Memory for coach: " + coach);

		System.out.println("\n Memory for alpha coach: " + alphaCoach);

		// close the context
		context.close();
	}

}
