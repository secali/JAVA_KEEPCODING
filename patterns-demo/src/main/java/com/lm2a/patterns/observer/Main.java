package com.lm2a.patterns.observer;

public class Main {

	public static void main(String[] args) {
		Observado o = new Observado();
		
		Observador o1 = new Observador("Observador 1");
		Observador o2 = new Observador("Observador 2");
		Observador o3 = new Observador("Observador 3");
		
		o.suscribe(o1);
		o.suscribe(o2);
		o.suscribe(o3);
		
		o.eventGeneration();
		
	}

}
