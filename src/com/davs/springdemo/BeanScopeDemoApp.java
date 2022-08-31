package com.davs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object" + result);
		
		System.out.println("\nMemory location for theCoach:" + theCoach);
		
		System.out.println("\nMemory location for alphaCoach:" + alphaCoach);

	}

}
