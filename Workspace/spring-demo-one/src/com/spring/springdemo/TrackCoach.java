package com.spring.springdemo;

public class TrackCoach implements Coach {
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define constructor
	public TrackCoach() {
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach: " + fortuneService.getFortune();
	}
}
