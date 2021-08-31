package com.sonata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name ="Aashrith";
	private int age =22;
	private float height = 5.5f;
	private boolean isProgrammer = true;
	@Autowired
	private Address address;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean getIsProgrammer() {
		return isProgrammer;
	}

	public void setIsProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}

	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isProgrammer=" + isProgrammer
				+ ", address=" + address + "]";
	}
	
	
}