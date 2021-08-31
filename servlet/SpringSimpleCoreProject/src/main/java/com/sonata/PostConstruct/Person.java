package com.sonata.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name="aashrith";
	private int age=22;
	private float height=5.5f;
	private boolean isProgrammer=true;
	
	//@Autowired
	@Autowired
	  public Person(Address address) {
	      super();
	      this.address = address;
	  }
	private Address address;
	
	//@Autowired
    public void setAddress(Address address) {
        this.address = address;
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

	public Address getAddress() {
		return address;
	}

	/*public void setAddress(Address address) {
		this.address = address;
	}*/

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isProgrammer=" + isProgrammer
				+ ", address=" + address + "]";
	}
	

}
