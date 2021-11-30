package com.bridgelabz;

public class MoodAnalyser {

	public String analyseMood(String message) {
		
		if(message.contains("any Mood")) {
			
			return "Happy";
		}
		return "sad";

	}
}
