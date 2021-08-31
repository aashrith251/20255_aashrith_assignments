package com.sonata.CustomQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "Aashrith";
	private int age = 23;
	private float height = 5.5f;
	private boolean isProgrammer = true;

	// Use @Autowired with a field
	@Autowired
	@MyCustomQualifier("mine")
	private AddressInterface address;

	public AddressInterface getAddress() {
		return address;
	}

	// public void setAddress(AddressInterface address) {
	// this.address = address;
	// }
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

	public boolean isProgrammer() {
		return isProgrammer;
	}

	public void setProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}

}