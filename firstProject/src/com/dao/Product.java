package com.dao;

public class Product {
public int ID;
public String Company;
public int Price;
public Product() {
	
}

public Product(int ID, String company, int price) {
	super();
	this.ID = ID;
	this.Company = company;
	this.Price = price;
}
public int getID() {
	return ID;
}
public void setID(int ID) {
	this.ID = ID;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	this.Company = company;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	this.Price = price;
}





}
