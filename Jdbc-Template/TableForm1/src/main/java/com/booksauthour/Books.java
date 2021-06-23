package com.booksauthour;

public class Books {
private int bid,price,authourid,pages;
private String name;
public Books(int bid, String name,int price, int authourid, int pages) {
	super();
	this.bid = bid;
	this.price = price;
	this.authourid = authourid;
	this.pages = pages;
	this.name = name;
}
public Books() {
	super();
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAuthourid() {
	return authourid;
}
public void setAuthourid(int authourid) {
	this.authourid = authourid;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}


