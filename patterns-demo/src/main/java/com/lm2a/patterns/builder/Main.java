package com.lm2a.patterns.builder;

public class Main {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Mario", "La Menza")
				.address("Camino de cintura 12, km 234")
				.age(22)
				.email("mario@gmail.com")
				.phone("656656656")
				.build();
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Juan", "Perez")
				.email("mario@gmail.com")
				.build();
				
		System.out.println(user2);
	}

}
