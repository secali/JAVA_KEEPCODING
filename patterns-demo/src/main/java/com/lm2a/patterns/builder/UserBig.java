package com.lm2a.patterns.builder;

public class UserBig {
	String name;
	String lastName;
	int age;
	String email;
	String phone;
	String address;
	
	public UserBig(String name, String lastName, int age, String email, String phone, String address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public UserBig(String name, String lastName, int age, String email, String phone) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	public UserBig(String name, String lastName, int age, String email) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
