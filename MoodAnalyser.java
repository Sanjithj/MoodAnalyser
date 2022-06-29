package com.bridgelabz;

public class MoodAnalyser {
	
	private String message;
	
	public MoodAnalyser(String message) {
		this.message =  message;
	}
	
	
	public String analyserMood() throws MoodAnalyserException {
		try {
			if(message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			throw new  MoodAnalyserException("Invalid Mood");
			
		}
	}


	public String MoodAnalyserException() {
		return null;
	}
}
