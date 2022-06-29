package com.bridgelabz;

public class MoodAnalyser {
	
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyserMood(String message) {
		this.message = message;
		return analyserMood();
		
	}
	public String analyserMood() {
		try {
			if(message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}
