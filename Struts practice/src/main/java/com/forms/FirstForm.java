package com.forms;

import org.apache.struts.action.ActionForm;

public class FirstForm extends ActionForm {
	
	
	String message= "Work Is Worship";
	
	public String getMessage() {
		
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
