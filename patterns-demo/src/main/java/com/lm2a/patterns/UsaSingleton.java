package com.lm2a.patterns;

public class UsaSingleton {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.setText("Mensaje secreto");
		System.out.println(s.getText());

	}

}
