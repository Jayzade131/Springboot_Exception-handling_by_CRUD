package com.main.userExceptions;




public class UserrNotFoundException extends RuntimeException {
	
	private String message;
	
	public UserrNotFoundException() {}

	public UserrNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
