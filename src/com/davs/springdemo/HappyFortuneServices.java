package com.davs.springdemo;

public class HappyFortuneServices implements FortuneService {
	
	
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
