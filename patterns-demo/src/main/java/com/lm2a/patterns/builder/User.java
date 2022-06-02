package com.lm2a.patterns.builder;

public class User {
	String name;
	String lastName;
	int age;
	String email;
	String phone;
	String address;
	
	public User(UserBuilder builder) {
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
	}


	public String getName() {
		return name;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}

	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", phone="
				+ phone + ", address=" + address + "]";
	}



	public static class UserBuilder{
		String name;
		String lastName;
		int age;
		String email;
		String phone;
		String address;
		
		public UserBuilder(String name, String lastName) {
			super();
			this.name = name;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		
		public UserBuilder email(String email) {
			this.email=email;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone=phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address=address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
	
}
