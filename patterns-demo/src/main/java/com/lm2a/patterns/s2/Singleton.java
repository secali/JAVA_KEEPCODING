package com.lm2a.patterns.s2;

public class Singleton {

	public String s;
	
	public static Singleton instance;

	public Singleton(String s) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.s = s;
	}
	
	public static Singleton getInstance(String s) {
		if(instance==null) {
			instance = new Singleton(s);
		}
		return instance;
	}
	
	
	
	
}
