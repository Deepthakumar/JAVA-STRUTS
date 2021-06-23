package com.booksauthour;

public class Authour {
private int authourid;
private String name;
public Authour() {
	super();
}


public Authour(int aid, String name) {
	super();
	this.authourid = aid;
	this.name = name;
}


public int getAuthourid() {
	return authourid;
}
public void setAuthourid(int aid) {
	this.authourid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
}
