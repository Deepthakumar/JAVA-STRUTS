package com.servlet2;

public class DetailsPerson {
private int EmpId; private String Name, City, designation;
public DetailsPerson() {}    
public DetailsPerson(int EmpId, String Name,String City, String designation) {
	super();
	this.EmpId = EmpId;
	this.Name = Name;
	this.City = City;
	this.designation = designation;
	
}
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
}
