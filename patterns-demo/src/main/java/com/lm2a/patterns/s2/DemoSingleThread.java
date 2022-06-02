package com.lm2a.patterns.s2;

public class DemoSingleThread {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance("HOLA");
		Singleton s2 = Singleton.getInstance("ADIOS");
		System.out.println(s.s);
		System.out.println(s2.s);
	}

}
