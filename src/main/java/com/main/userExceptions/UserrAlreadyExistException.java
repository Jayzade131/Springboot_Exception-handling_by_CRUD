package com.main.userExceptions;


public class UserrAlreadyExistException extends RuntimeException {
	
	private String message;
	public UserrAlreadyExistException() {}

	public UserrAlreadyExistException(String message) {
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
