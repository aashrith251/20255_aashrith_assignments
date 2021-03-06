package com.sonata.Model;
import java.util.Date;

public class User {
	private Integer userId;
	private String userName;
	private String email;
	private Long contactNumber;
	private String role;
	private Boolean isAlive;
	private Date dob;
	private Date createdOn;
	public Integer getUserId() {
	return userId;
	}
	public void setUserId(Integer userId) {
	this.userId = userId;
	}
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public Long getContactNumber() {
	return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
	this.contactNumber = contactNumber;
	}
	public String getRole() {
	return role;
	}
	public void setRole(String role) {
	this.role = role;
	}
	public Boolean getIsAlive() {
	return isAlive;
	}
	public void setIsAlive(Boolean isAlive) {
	this.isAlive = isAlive;
	}
	public Date getDob() {
	return dob;
	}
	public void setDob(Date dob) {
	this.dob = dob;
	}
	public Date getCreatedOn() {
	return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
	}
	@Override
	public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", contactNumber=" + contactNumber + ", role=" + role + ", isAlive="
	+ isAlive + ", dob=" + dob + ", createdOn=" + createdOn + "]";
	}
}
