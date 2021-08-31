package com.sonata.PostConstruct;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city="nellore";
	private String state="ap";
	private String country="india";
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@PostConstruct
	public void doSomethingAfterConstruct() {
		String oldCity = city;
		city = "nel";
		System.out.println("--->Old city = " + oldCity + ", New city = " + city);
	}

	@PreDestroy
	public void doSomethingBeforeDestroy() {
		System.out.println("--->Before Address object is destroyed");
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
