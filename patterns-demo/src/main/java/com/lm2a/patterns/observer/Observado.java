package com.lm2a.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {

	List<IObserver> observers = new ArrayList<>();
	
	public void suscribe(IObserver observer) {
		observers.add(observer);
	}
	
	public void unSuscribe(IObserver observer) {
		observers.remove(observer);
	}
	
	public void notify(String event) {
		for(IObserver o: observers) {
			o.update(event);
		}
	}
	
	public void eventGeneration() {
		for(int i=0; i<100; ++i) {
			int random = (int) (Math.random()*100+1);
			System.out.println("Valor generado: "+random);
			if(random > 50) {
				notify("Valor="+random);
			}
		}
	}
}
