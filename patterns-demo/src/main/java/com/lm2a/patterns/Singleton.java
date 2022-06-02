package com.lm2a.patterns;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		createInstance();
		return instance;
	}

	private static void createInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		
	}
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
