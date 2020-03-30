package com.prateek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(coach.getDailyWorkOut());

		// let's call our new method for fortune service
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();

	}
}
