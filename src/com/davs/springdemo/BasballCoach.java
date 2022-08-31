package com.davs.springdemo;

public class BasballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	
	
	public BasballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getdailyFortune() {
		return fortuneService.getFortune();
	}

}
