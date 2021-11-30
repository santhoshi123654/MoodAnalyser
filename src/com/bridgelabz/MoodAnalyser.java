package com.bridgelabz;

public class MoodAnalyser {

	String message;
	
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood(String message) {
		
		if(message.contains("Happy")) {
			return "Happy";
		}
		
		else {
			return null;
		}
	}
}
