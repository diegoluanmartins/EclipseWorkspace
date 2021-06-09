package com.spring.springdemo;

public class GymCoach implements Coach {
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define constructor
	public GymCoach() {
	}
	public GymCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 4x15 reps of squats";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
