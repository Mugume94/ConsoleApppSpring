package com.davs.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket coach: Inside no-arg constructor");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach : inside setter method - set Fortune service");
		this.fortuneService = fortuneService;
	}
	

	public String getEmailAdress() {
		return emailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		System.out.println("Cricket Coach : inside setter method - set EmailAdress");
		this.emailAdress = emailAdress;
	}



	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Cricket Coach : inside setter method - set Team");
		this.team = team;
	}



	@Override
	public String getDailyWorkOut() {
		return "Practice fast bawling for 15minutes a day";
	}

	@Override
	public String getdailyFortune() {
		return fortuneService.getFortune() ;
	}

}
