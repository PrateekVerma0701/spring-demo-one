package com.prateek.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency

	private FortuneService fortuneService;

	// define a constructor for dependency injection

	// No Argument Constructor
	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune

		return "Just Do IT : " + fortuneService.getFortune();
	}
}
