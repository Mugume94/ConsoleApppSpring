package com.davs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from the spring container 
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getdailyFortune());
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		
		
		// call the methods on the bean
		
		context.close();

	}

}
