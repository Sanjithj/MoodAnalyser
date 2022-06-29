package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

class TestCase {

	@Test
	public void testHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood= moodAnalyser.analyserMood();
		Assert.assertEquals( "HAPPY", mood);
		
	}

}
