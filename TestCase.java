package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

class TestCase {

	@Test
	public void testHappy() {
		MoodAnalyserException moodAnalyser = new MoodAnalyserException(null);
		String mood= moodAnalyser.MoodAnalyserException();
		Assert.assertEquals( "HAPPY", mood);
		
	}

}
