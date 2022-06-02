package com.lm2a.patterns;

public class UsaSingleton2 {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
        s.setText("holaaa");

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getText());

	}

}
