package com.demo.beans;

public class User {
	private int userId;
	private String name;
	private String role;
	private int contactNumber;
	private String email;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", role=" + role + ", contactNumber=" + contactNumber
				+ ", email=" + email + ", password=" + password + "]";
	}
	public User(int userId, String name, String role, int contactNumber, String email, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.role = role;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
	}
	

}
