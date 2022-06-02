package com.lm2a.patterns.observer;

public class Observador implements IObserver {

	String nombre;
	
	public Observador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void update(String tipoEvento) {
		System.out.println("Tipo del evento notificado: "+tipoEvento+" ("+nombre+")");

	}

}
