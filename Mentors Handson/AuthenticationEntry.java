package com.handsons;
public class AuthenticationEntry {
private String mailId;
private String password;
private Long number;
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}
public AuthenticationEntry(String mailId, String password, Long number) {
	super();
	this.mailId = mailId;
	this.password = password;
	this.number = number;
}
public AuthenticationEntry() {
	super();
}

}