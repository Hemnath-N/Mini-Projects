package com.appdeveloperblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	private static final long serialVersionUID = -3393273220211107601L;
	
	public UserServiceException(String message) {
		super(message);
	}

}
