package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

public static MoodAnalyser moodAnalyser;
String presentMood = null;
	@BeforeClass
	public static void initialize() {
		
		moodAnalyser = new MoodAnalyser();
	}

	@Test
	public void analyse_the_mood_if_happy_return_Happy()throws InvalidUserMoodException {
		
		try {
			String message = "I am in Happy Mood";
			String presentMood = moodAnalyser.analyseMood(message);
			
			assertEquals("Happy", presentMood);	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void analyse_the_mood_if_sad_return_Sad() throws InvalidUserMoodException {
		try {
			
			String message = "I am in Sad Mood";
			String presentMood = moodAnalyser.analyseMood(message);
			
			assertEquals("Sad", presentMood);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
