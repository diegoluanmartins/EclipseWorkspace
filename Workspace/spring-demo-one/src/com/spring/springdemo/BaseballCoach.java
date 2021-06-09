package com.spring.springdemo;

public class BaseballCoach implements Coach {
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define constructor
	public BaseballCoach() {
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
