package com;

public class AccountHolder {
private String name;
private String gender;
private String phone;
private String email;
public AccountHolder() {
	// TODO Auto-generated constructor stub
}

public AccountHolder(String name, String gender, String phone, String email) {
	super();
	this.name = name;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
