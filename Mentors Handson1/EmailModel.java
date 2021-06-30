package com.handsons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailModel {
	private String emailid;
	private String password;
	
	
	
	public EmailModel() {
		super();
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		
		this.emailid = emailid;
		//@Pattern(regexp="^[@]{1}",message="length must be 1")
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
