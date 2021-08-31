package com.sonata.AddressInterface;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("aashrith home")
public class MyAddress implements AddressInterface {
	
	private int streetNumber = 202;
	private String streetName = "Balaji";
	private String city = "Nellore";
	private String country = "India";
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getWholeAddress() {
		String wholeAddress = "My Address = " + getStreetNumber() + " " +
				getStreetName() + " " +
				getCity() + " " +
				getCountry();
		return wholeAddress;
	}
}
