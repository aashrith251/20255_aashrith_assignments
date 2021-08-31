package com.sonata.AddressInterface;
import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private String name = "Aashrith";
	private int age = 22;
	private float height = 5.5f;
	private boolean isProgrammer = true;

	//@Autowired
	@Inject
	@Qualifier("youraddress")
	private AddressInterface address;
	

	public AddressInterface getAddress() {
		return address;
	}

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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isProgrammer=" + isProgrammer
				+ ", address=" + address + "]";
	}
	

}
