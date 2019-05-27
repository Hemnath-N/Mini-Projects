package com.appdeveloperblog.app.ws.ui.model.response;

public enum ErrorMessages {

	MISSING_REQUIRED_FIELD("Missing Required Fileds. Please Ceck Documentation"),
	RECORD_ALREADY_EXISTS("Record Already Exists"),
	INTERNAL_SERVER_ERROR("Internal Server Error"),
	NO_RECORD_FOUND("No Record Found"),
	APPLICATION_FAILED("Application Failed"),
	COULD_NOT_CREATE_RECORD("Could not create record"),
	COULD_NOT_UPDATE_RECORD("Could not update record"),
	EMAIL_ADDRESS_NOT_VERIFIED("Email address not verified");
	
	private String errorMessage;

	ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
