package com.davs.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneService = fortuneservice;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Run a hard 5K";
	}
	
	@Override
	
	public String getdailyFortune() {
		return fortuneService.getFortune();
	}

}
