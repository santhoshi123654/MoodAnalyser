package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {

public static MoodAnalyser moodAnalyser;
	
	@BeforeClass
	public static void initialize() {
		
		moodAnalyser = new MoodAnalyser();
	}

	@Test
	public void analyse_the_mood_if_sad_return_Sad() {
		
		String message = "I am in Sad Mood";
		String presentMood = moodAnalyser.analyseMood(message);
		
		assertEquals("Sad", presentMood);	

	}
}
